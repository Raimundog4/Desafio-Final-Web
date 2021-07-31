#language: pt
@Carrinho @End2End
Funcionalidade: Carrinho

  Contexto: 
    Dado que o usuario esteja na tela principal do sitema
    E que esteja logado no sistema

  Esquema do Cenario: Adicionar Produtos com sucesso
    Quando clicar no botao Add To Cart do produto "<produto>"
    E clicar no botao do carrinho
    Entao o sistema ira mostrar o produto adicionado

    Exemplos: 
      | produto             |
      | Sauce Labs Backpack |
