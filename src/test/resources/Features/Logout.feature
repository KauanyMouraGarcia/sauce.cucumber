Feature: Logout de usuario
Como usuario logado
Quero realizar logout 
Para encerrar a sessao do usuario

Scenario: Logout de usuario 
Given que o usuario esteja logado 
When clicar em logout
Then volta para tela de login 