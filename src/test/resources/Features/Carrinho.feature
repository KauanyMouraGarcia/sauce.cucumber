Feature: Carrinho
Como usuario
Quero incluir/remover produtos do carrinho
Para finalizar minha compra

Background: Usuario logado
Given que usuário esteja logado

Scenario: Incluir no carrinho
When incluir produtos no carrinho 
Then valida o carrinho

Scenario: Remover do carrinho
When incluir produtos no carrinho 
And remover produtos do carrinho 
Then produto removido do carrinho