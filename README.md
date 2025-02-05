# 💻 Projeto de Automação de Testes E2E - Sauce Demo

Este repositório contém a automação de testes de ponta a ponta (E2E) para o sistema **Sauce Demo**, utilizando Java, Cucumber e Selenium para validar funcionalidades de uma aplicação web.



## 📋 Descrição

O objetivo deste projeto é garantir a qualidade das funcionalidades principais do sistema, testando cenários críticos como: login, logout, compra, preenchimento de formulários, e validação de mensagens de erro e sucesso.

Os testes seguem boas práticas de automação e possuem foco em:

- Verificação de fluxo de login.
- Validação de mensagens de feedback para o usuário.
- Garantia de funcionalidades essenciais do sistema.

## 🛠️ Tecnologias e Ferramentas

- **Java**: Linguagem utilizada nos scripts de teste.
- **Selenium**: Automação de testes para aplicações web.
- **Cucumber**: Framework para testes BDD (Behavior-Driven Development).
- **JUnit/TestNG**: Para execução e organização dos testes.



## 🚀 Como Executar o Projeto

###  📌Pré-requisitos

Certifique-se de ter instalado:

- Java JDK 11 ou superior.
- Maven (para gerenciamento de dependências).
- Google Chrome (ou outro navegador compatível com Selenium).
- ChromeDriver (ou o driver correspondente ao navegador escolhido).

### 👨🏻‍💻 Passos para Configuração

 1. Clone o repositório:
 ```bash
	git clone https://github.com/KauanyMouraGarcia/sauce.cucumber.git 
```
 2. Entrar na pasta do projeto clonado:
 ```bash
	cd sauce.cucumber
```
3. Instale as dependências via Maven:
 ```bash
	mvn clean install
```

### 🤖 Executar os Testes:

Para rodar os testes, utilize um dos seguintes comandos:

-  Executar todos os testes:
 ```bash
	mvn test
```

-  Para executar os testes de um arquivo específico:
 ```bash
	mvn test -Dcucumber.options="classpath:features/login.feature"
```

-  Gerar relatório de testes:
 ```bash
	mvn verify
```


## 🧪 Testes Implementados

### Testes de Login

-   **Login realizado com sucesso**:
	-  Preenche os dados de login válidos e verifica a mensagem de sucesso.
	-  Garante que o usuário foi redirecionado corretamente.

-   **Login com senha inválida**:
	 - Tenta logar com senha inválida e valida a mensagem de erro exibida.

-   **Login com usuário inválido**:    
	-  Tenta logar com usuário inválido e valida a mensagem de erro exibida.
        
-   **Login com usuário bloqueado**:    
	-  Tenta logar com usuário bloqueado e valida a mensagem de erro exibida.

-   **Login com dados em branco**:    
	-  Tenta logar com dados em branco e valida a mensagem de erro exibida.

### Teste de Logout

-   **Logout com sucesso**:    
	-  Usuário logado sai da sua conta ao clicar em Logout. 

### Testes de Carrinho

-   **Adicionar produto ao carrinho**:    
	-  Produto é adicionado ao carrinho ao clicar em Add to cart.  

-   **Remover produto do carrinho**:    
	-  Produto é removido do carrinho ao clicar em Remove.


### Testes de Compra

-   **Compra realizada com sucesso**:    
	-  Usuário logado adiciona produto(s) ao carrinho, ao clicar em Checkout é redirecionado para uma página 
	na qual o cliente deve preencher com seus dados pessoais e em seguida finalizar a compra. Ao final do processo
	a aplicação exibirá uma mensagem de sucesso.

-   **Compra com dados em branco**:    
	-   Ao ser redirecionado, o usuário tenta enviar o formulário de dados em branco. 
	A aplicação exibirá uma mensagem de erro.

-   **Compra com campo First Name em branco**:    
	-  Ao ser redirecionado, o usuário tenta enviar o formulário de dados sem preencher o campo First Name. 
	A aplicação exibirá uma mensagem de erro.

-   **Compra com campo Last Name em branco**:    
	-  Ao ser redirecionado, o usuário tenta enviar o formulário de dados sem preencher o campo Last Name. 
	A aplicação exibirá uma mensagem de erro.

-   **Compra com campo Postal Code em branco**:    
	-  Ao ser redirecionado, o usuário tenta enviar o formulário de dados sem preencher o campo Postal Code. 
	A aplicação exibirá uma mensagem de erro.
		  


## 📦 Dependências Principais

As principais dependências do projeto são:

-   [Selenium](https://www.selenium.dev/): Framework de testes web.
-   [Cucumber](https://cucumber.io/): Framework baseado em BDD.



##  📂 Estrutura do Projeto

A organização do projeto segue a estrutura:

 ```bash
📦 sauce.cucumber 
 ┣ 📂 src  
 ┃ ┣ 📂 test  
 ┃ ┃ ┣ 📂 java  
 ┃ ┃ ┃ ┣ 📂 drivers         # Configuração do WebDriver  
 ┃ ┃ ┃ ┣ 📂 elementos       # Mapeamento de elementos das páginas  
 ┃ ┃ ┃ ┣ 📂 metodos         # Métodos genéricos reutilizáveis  
 ┃ ┃ ┃ ┣ 📂 pages           # Implementação do Page Object Model (POM)  
 ┃ ┃ ┃ ┣ 📂 runner          # Execução dos testes automatizados definidos nos arquivos .feature 
 ┃ ┃ ┃ ┣ 📂 steps           # Definição dos passos dos testes  
 ┃ ┃ ┣ 📂 resources  
 ┃ ┃ ┃ ┗ 📂 features        # Cenários de testes em BDD (arquivos .feature)  
 ┣ 📄 pom.xml               # Dependências do Maven  
 ┣ 📄 README.md             # Documentação do projeto  



	
```



##  🚀 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias.

## 📌 Notas Gerais
Feito com ❤️ por [Kauany Moura Garcia](https://github.com/KauanyMouraGarcia) 😊





