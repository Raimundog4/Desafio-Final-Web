package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CheckoutSteps {

	@Quando("^clicar no botao Checkout$")
	public void clicarNoBotaoCheckout() throws Throwable {
	}

	@Quando("^preencher o campo First Name como \"([^\"]*)\"$")
	public void preencherOCampoFirstNameComo(String arg1) throws Throwable {
	}

	@Quando("^preencher o campo Last Name como \"([^\"]*)\"$")
	public void preencherOCampoLastNameComo(String arg1) throws Throwable {
	}

	@Quando("^preencher o campo Zip/Postal Code como \"([^\"]*)\"$")
	public void preencherOCampoZipPostalCodeComo(String arg1) throws Throwable {
	}

	@Quando("^clicar no cotao Continue$")
	public void clicarNoCotaoContinue() throws Throwable {
	}

	@Entao("^o sistema devera apresentar a pagnia com a descricao da compra$")
	public void oSistemaDeveraApresentarAPagniaComADescricaoDaCompra() throws Throwable {
	}
	
}
