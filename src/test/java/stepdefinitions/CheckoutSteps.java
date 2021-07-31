package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CheckoutPage;

public class CheckoutSteps {

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

	@Quando("^clicar no cotao Continue$")
	public void clicarNoCotaoContinue() throws Exception {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.clicarBotaoContinue();
	}

	@Entao("^o sistema devera apresentar a pagnia com a descricao da compra$")
	public void oSistemaDeveraApresentarAPagniaComADescricaoDaCompra() throws Exception {
		CheckoutPage checkoutPage = new CheckoutPage(Hooks.driver);
		checkoutPage.validarCheckout();
	}
	
}
