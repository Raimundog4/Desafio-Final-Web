package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LogoutPage;

public class LogoutSteps {

	@Quando("^acionar o menu clicando no botao Burguer$")
	public void acionarOMenuClicandoNoBotaoBurguer() throws Exception {
		LogoutPage logoutPage = new LogoutPage(Hooks.driver);
		logoutPage.acionarMenuHamburguer();
	}

	@Quando("^clicar na opcao logout$")
	public void clicarNaOpcaoLogout() throws Exception {
		LogoutPage logoutPage = new LogoutPage(Hooks.driver);
		logoutPage.clicarLogout();
	}

	@Entao("^o sistema ira mostrar a tela principal$")
	public void oSistemaIraMostrarATelaPrincipal() throws Exception {
		LogoutPage logoutPage = new LogoutPage(Hooks.driver);
		logoutPage.validarLogout();
	}


	
}
