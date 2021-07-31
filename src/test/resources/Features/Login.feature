#language: pt
@Login @End2End
Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na tela principal do sitema

  @RealizarLogin @SmokeTest
  Esquema do Cenario: Realizar Login com sucesso
    Quando informar o campo Username como "<usuario>"
    E informar o campo Password como "<senha>"
    E clicar no botao Login
    Entao o sistema ira apresentar a tela de produtos

    Exemplos: 
      | usuario                 | senha        |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
