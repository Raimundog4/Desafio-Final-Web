package pageobjects;

import static org.junit.Assert.assertTrue;
import static utils.Uteis.esperarElemento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPage {

	protected WebDriver driver;
	
	public CarrinhoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "shopping_cart_container")
	private WebElement botaoCarrinho;
	
	public void adicionarProdutoCarrinho(String produto) {
		produto = produto.replace(" ", "-").toLowerCase();
		WebElement item = (WebElement) driver.findElement(By.id("add-to-cart-"+produto));
		esperarElemento(item);
		item.click();
	}
	
	public void clicarBotaoCarrinho() {
		esperarElemento(botaoCarrinho);
		botaoCarrinho.click();
	}
	
	public void validarProdutoCarrinho(String produto) {
		WebElement item = (WebElement) driver.findElement(By.linkText(produto));
		esperarElemento(item);
		assertTrue(item.isDisplayed());
	}
	
}
