package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CarrinhoPage;

public class CarrinhoSteps {

	private String produto;
	
	@Quando("^clicar no botao Add To Cart do produto \"([^\"]*)\"$")
	public void clicarNoBotaoAddToCartDoProduto(String arg1) throws Throwable {
		CarrinhoPage carrinhoPage = new CarrinhoPage(Hooks.driver);
		this.produto = arg1;
		carrinhoPage.adicionarProdutoCarrinho(arg1);
	}

	@Quando("^clicar no botao do carrinho$")
	public void clicarNoBotaoDoCarrinho() throws Throwable {
		CarrinhoPage carrinhoPage = new CarrinhoPage(Hooks.driver);
		carrinhoPage.clicarBotaoCarrinho();
	}

	@Entao("^o sistema ira mostrar o produto adicionado$")
	public void oSistemaIraMostrarOProdutoAdicionado() throws Throwable {
		CarrinhoPage carrinhoPage = new CarrinhoPage(Hooks.driver);
		carrinhoPage.validarProdutoCarrinho(produto);
	}

	
}
