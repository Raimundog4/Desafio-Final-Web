#language: pt
#enconding: UTF-8
@Logout
Funcionalidade: Logout

  Contexto: 
    Dado que o usuario esteja na tela principal do sitema
    E que esteja logado no sistema

  @RealizarLogout @SmokeTest
  Cenario: Realizar Logout com sucesso
    Quando acionar o menu clicando no botao Burguer
    E clicar na opcao logout
    Entao o sistema ira mostrar a tela principal
