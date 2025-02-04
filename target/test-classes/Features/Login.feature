Feature: Login
Como usuario da aplicacao
Quero informar os dados de login
Para realizar login na minha conta

Background: Tela de Login 
Given que esteja na tela de Login


Scenario: Login com sucesso
When enviar usuario e senha
Then acesso a conta

Scenario: Login com senha invalida 
And informar usuario correto
And informar senha invalida
When enviar os dados
Then recebo a mensagem de senha invalida 


Scenario: Login com usuario invalido
And informar usuario invalido
And informar senha correta 
When enviar os dados
Then recebo a mensagem de usuario invalido


Scenario: Login com usuario bloqueado
And informar usuario bloqueado
And informar senha correta 
When enviar os dados
Then recebo a mensagem de usuario bloqueado


Scenario: Login com dados em branco
When enviar os dados
Then recebo a mensagem "Epic sadface: Username is required"

