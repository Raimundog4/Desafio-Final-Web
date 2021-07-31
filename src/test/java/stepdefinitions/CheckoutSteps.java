package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CheckoutPage;

public class CheckoutSteps {

	@Dado("^tenha realizado o Checkout$")
	public void tenhaRealizadoOCheckout() throws Throwable {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.clicarBotaoCheckout();
		checkoutPage.preencherCampoNome("Lorenzo");
		checkoutPage.preencherCampoSobrenome("Silva");
		checkoutPage.preencherCampoCep("48020-202");
		checkoutPage.clicarBotaoContinue();
	}
	
	@Quando("^clicar no botao Checkout$")
	public void clicarNoBotaoCheckout() throws Exception {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.clicarBotaoCheckout();
	}

	@Quando("^preencher o campo First Name como \"([^\"]*)\"$")
	public void preencherOCampoFirstNameComo(String arg1) throws Exception {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.preencherCampoNome(arg1);
	}

	@Quando("^preencher o campo Last Name como \"([^\"]*)\"$")
	public void preencherOCampoLastNameComo(String arg1) throws Exception {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.preencherCampoSobrenome(arg1);
	}

	@Quando("^preencher o campo Zip/Postal Code como \"([^\"]*)\"$")
	public void preencherOCampoZipPostalCodeComo(String arg1) throws Exception {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.preencherCampoCep(arg1);
	}

	@Quando("^clicar no botao Continue$")
	public void clicarNoBotaoContinue() throws Exception {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.clicarBotaoContinue();
	}

	@Entao("^o sistema devera apresentar a pagina com a descricao da compra$")
	public void oSistemaDeveraApresentarAPaginaComADescricaoDaCompra() throws Exception {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.validarCheckout();
	}
	
}
