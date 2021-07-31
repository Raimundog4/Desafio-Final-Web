package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CompraPage;

public class CompraSteps {

	@Quando("^clicar no botao Finish$")
	public void clicarNoBotaoFinish() throws Exception {
		CompraPage compraPage = new CompraPage(Hooks.driver);
		compraPage.clicarBotaoFinish();
	}

	@Entao("^o sistema ira apresentar uma pagina confirmando a compra$")
	public void oSistemaIraApresentarUmaPaginaConfirmandoACompra() throws Exception {
		CompraPage compraPage = new CompraPage(Hooks.driver);
		compraPage.validarCompra();
	}
	
}
