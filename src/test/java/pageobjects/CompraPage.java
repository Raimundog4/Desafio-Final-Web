package pageobjects;

import static org.junit.Assert.assertTrue;
import static utils.Uteis.esperarElemento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CompraPage {

	protected WebDriver driver;
	
	public CompraPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "finish")
	private WebElement botaoFinish;
	
	@FindBy(how = How.ID, using = "checkout_complete_container")
	private WebElement confirmacaoCompra;
	
	public void clicarBotaoFinish() {
		esperarElemento(botaoFinish);
		botaoFinish.click();
	}
	
	public void validarCompra() {
		esperarElemento(confirmacaoCompra);
		assertTrue(confirmacaoCompra.isDisplayed());
	}
	
}
