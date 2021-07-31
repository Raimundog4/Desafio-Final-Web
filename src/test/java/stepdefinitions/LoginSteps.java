package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {
	
	WebDriver driver;

	@Dado("^que o usuario esteja na tela principal do sitema$")
	public void queOUsuarioEstejaNaTelaPrincipalDoSitema() throws Exception {
	Hooks.abrirUrl("https://www.saucedemo.com/");
	driver = Hooks.driver;
	}

	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informarOCampoUsernameComo(String arg1) throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.preencerCampoUsuario(arg1);
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informarOCampoPasswordComo(String arg1) throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.preencerCampoSenha(arg1);
	}

	@Quando("^clicar no botao Login$")
	public void clicarNoBotaoLogin() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.acionarBotaoLogin();
	}

	@Entao("^o sistema ira apresentar a tela de produtos$")
	public void oSistemaIraApresentarATelaDeProdutos() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		//Verifica se estão aparecendo os produtos
		loginPage.validarPaginaProdutos();
	}

}
