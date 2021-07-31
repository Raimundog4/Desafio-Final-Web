package pageobjects;

import static org.junit.Assert.assertTrue;
import static utils.Uteis.esperarElemento;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	protected WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	private WebElement menuHamburguer;
	
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	private WebElement botaoLogout;
	
	@FindBy(how = How.ID, using = "login_button_container")
	private WebElement paginaLogin;
	
	public void acionarMenuHamburguer() {
		esperarElemento(menuHamburguer);
		menuHamburguer.click();
	}
	
	public void clicarLogout() {
		esperarElemento(botaoLogout);
		botaoLogout.click();
	}
	
	public void validarLogout() {
		esperarElemento(paginaLogin);
		assertTrue(paginaLogin.isDisplayed());
	}
	
}
