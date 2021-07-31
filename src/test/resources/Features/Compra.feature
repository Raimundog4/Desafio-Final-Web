#language: pt
#enconding: UTF-8
@Compra @End2End
Funcionalidade: Compra

  Contexto: 
    Dado que o usuario esteja na tela principal do sitema
    E que esteja logado no sistema

  @RealizarCompra @SmokeTest
  Esquema do Cenario: Realizar Compra
    Dado que o usuario tenha adicionado o produto "<produto>" ao carrinho
    E tenha realizado o Checkout
    Quando clicar no botao Finish
    Entao o sistema ira apresentar uma pagina confirmando a compra

    Exemplos: 
      | produto             |
      | Sauce Labs Backpack |
