Feature: Compra 
Como usuario 
Quero adicionar produtos ao carrinho
Para finalizar a compra 

Background: Usuario logado
Given que usuario esteja logado
When possuir produtos no carrinho 
And clicar em Checkout

Scenario: Compra com sucesso
And preencher todos os campos de dados pessoais com dados validos 
And finalizar a compra
Then compra e validada com sucesso 
And a mensagem de sucesso e exibida

Scenario: Compra com dados em branco
And não preencher nenhum campo dos dados pessoais
And clicar em Continue
Then mensagem de erro de dados e exibida 


Scenario: Compra com campo First Name em branco
And não preencher o campo First Name
And clicar em Continue
Then mensagem de erro de nome e exibida 


Scenario: Compra com campo Last Name em branco
And não preencher o campo Last Name
And clicar em Continue
Then mensagem de erro de sobrenome e exibida 


Scenario: Compra com campo Postal Code em branco 
And não preencher o campo Postal Code
And clicar em Continue
Then mensagem de erro de codigo postal e exibida 






