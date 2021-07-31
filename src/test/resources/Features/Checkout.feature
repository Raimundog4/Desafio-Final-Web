#language: pt
#enconding: UTF-8
@Checkout @End2End
Funcionalidade: Checkout

  Contexto: 
    Dado que o usuario esteja na tela principal do sitema
    E que esteja logado no sistema

  @RealizarCheckout @SmokeTest
  Esquema do Cenario: Realizar Checkout com sucesso
    Dado que esteja na pagina do carrinho com o produto "<produto>" adicionado
    Quando clicar no botao Checkout
    E preencher o campo First Name como "<nome>"
    E preencher o campo Last Name como "<sobrenome>"
    E preencher o campo Zip/Postal Code como "<cep>"
    E clicar no botao Continue
    Entao o sistema devera apresentar a pagina com a descricao da compra

    Exemplos: 
      | produto             | nome     | sobrenome | cep      |
      | Sauce Labs Backpack | Raimundo | Mendonça  | 49043080 |
