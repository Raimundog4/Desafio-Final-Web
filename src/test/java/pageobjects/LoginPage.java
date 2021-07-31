package pageobjects;

import static org.junit.Assert.assertTrue;
import static utils.Uteis.esperarElemento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "user-name")
	private WebElement campoUsuario;

	@FindBy(how = How.ID, using = "password")
	private WebElement campoSenha;
	
	@FindBy(how = How.ID, using = "login-button")
	private WebElement btnLogin;
	
	@FindBy(how = How.ID, using = "inventory_container")
	private WebElement containerProdutos;
	
	public void preencerCampoUsuario(String usuario) {
		esperarElemento(campoUsuario);
		campoUsuario.sendKeys(usuario);
	}
	
	public void preencerCampoSenha(String senha) {
		esperarElemento(campoSenha);
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		esperarElemento(btnLogin);
		btnLogin.click();
	}
	
	public void validarPaginaProdutos() {
		esperarElemento(containerProdutos);
		assertTrue(containerProdutos.isDisplayed());
	}
}
