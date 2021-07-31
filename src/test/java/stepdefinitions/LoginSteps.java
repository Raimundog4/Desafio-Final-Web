package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

	@Dado("^que o usuario esteja na tela principal do sitema$")
	public void queOUsuarioEstejaNaTelaPrincipalDoSitema() throws Throwable {
	}

	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informarOCampoUsernameComo(String arg1) throws Throwable {
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informarOCampoPasswordComo(String arg1) throws Throwable {
	}

	@Quando("^clicar no botao Login$")
	public void clicarNoBotaoLogin() throws Throwable {
	}

	@Entao("^o sistema ira apresentar a tela de produtos$")
	public void oSistemaIraApresentarATelaDeProdutos() throws Throwable {
	}

}
