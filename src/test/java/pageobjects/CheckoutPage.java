package pageobjects;

import static org.junit.Assert.assertTrue;
import static utils.Uteis.esperarElemento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	protected WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "checkout")
	private WebElement botaoCheckout;

	@FindBy(how = How.ID, using = "first-name")
	private WebElement campoNome;
	
	@FindBy(how = How.ID, using = "last-name")
	private WebElement campoSobrenome;
	
	@FindBy(how = How.ID, using = "postal-code")
	private WebElement campoCep;
	
	@FindBy(how = How.ID, using = "continue")
	private WebElement botaoContinue;
	
	@FindBy(how = How.ID, using = "checkout_summary_container")
	private WebElement containerDescricao;
	
	public void clicarBotaoCheckout() {
		esperarElemento(botaoCheckout);
		botaoCheckout.click();
	}
	
	public void preencherCampoNome(String nome) {
		esperarElemento(campoNome);
		campoNome.sendKeys(nome);
	}
	
	public void preencherCampoSobrenome(String sobrenome) {
		esperarElemento(campoSobrenome);
		campoSobrenome.sendKeys(sobrenome);
	}
	
	public void preencherCampoCep(String cep) {
		esperarElemento(campoCep);
		campoCep.sendKeys(cep);
	}
	
	public void clicarBotaoContinue() {
		esperarElemento(botaoContinue);
		botaoContinue.click();
	}
	
	public void validarCheckout() {
		esperarElemento(containerDescricao);
		assertTrue(containerDescricao.isDisplayed());
	}
	
}
