package sauce.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauce.cucumber.metodos.Metodos;
import sauce.cucumber.pages.CarrinhoPage;
import sauce.cucumber.pages.CompraPage;
import sauce.cucumber.pages.HomePage;
import sauce.cucumber.runner.Executa;

public class CompraTeste {

	Metodos metodo = new Metodos();
	HomePage home = new HomePage();
	CompraPage page = new CompraPage();
	CarrinhoPage carrinho = new CarrinhoPage();

	@After
	public void finalizar() {
		Executa.finalizarTeste();

	}

	@Given("que usuario esteja logado")
	public void que_usuario_esteja_logado() {
		Executa.iniciarTeste();
		home.login("standard_user", "secret_sauce");

	}

	@When("possuir produtos no carrinho")
	public void possuir_produtos_no_carrinho() {
		carrinho.adicionarAoCarrinho();
		carrinho.acessarCarrinho();

	}

	@When("clicar em Checkout")
	public void clicar_em_checkout() {
		carrinho.checkout();

	}

	@When("preencher todos os campos de dados pessoais com dados validos")
	public void preencher_todos_os_campos_de_dados_pessoais_com_dados_validos() {
		page.preencherDadosPessoais("Nome", "Sobrenome", "11112222");

	}

	@When("finalizar a compra")
	public void finalizar_a_compra() {
		page.finalizarCompra();

	}

	@Then("compra e validada com sucesso")
	public void compra_e_validada_com_sucesso() {
		metodo.validarUrl("https://www.saucedemo.com/checkout-complete.html");
	}

	@Then("a mensagem de sucesso e exibida")
	public void a_mensagem_de_sucesso_e_exibida() {
		metodo.validarMensagem(page.msgSucesso, "Thank you for your order!");
		page.voltarParaHome();
	}

	@When("não preencher nenhum campo dos dados pessoais")
	public void não_preencher_nenhum_campo_dos_dados_pessoais() {
		page.preencherDadosPessoais("", "", "");
	}

	@When("clicar em Continue")
	public void clicar_em_continue() {
		page.clicarEmContinue();
	}

	@Then("mensagem de erro de dados e exibida")
	public void mensagem_de_erro_de_dados_e_exibida() {
		metodo.validarMensagem(page.msgErroDados, "Error: First Name is required");
	}

	@When("não preencher o campo First Name")
	public void não_preencher_o_campo_first_name() {
		page.preencherDadosPessoais("", "Teste", "12345678");
		page.clicarEmContinue();
	}

	@Then("mensagem de erro de nome e exibida")
	public void mensagem_de_erro_de_nome_e_exibida() {
		metodo.validarMensagem(page.msgErroDados, "Error: First Name is required");
	}

	@When("não preencher o campo Last Name")
	public void não_preencher_o_campo_last_name() {
		page.preencherDadosPessoais("Teste", "", "87654321");
		page.clicarEmContinue();
	}

	@Then("mensagem de erro de sobrenome e exibida")
	public void mensagem_de_erro_de_sobrenome_e_exibida() {
		metodo.validarMensagem(page.msgErroDados, "Error: Last Name is required");
	}

	@When("não preencher o campo Postal Code")
	public void não_preencher_o_campo_postal_code() {
		page.preencherDadosPessoais("Sauce", "Demo", "");
		page.clicarEmContinue();
	}

	@Then("mensagem de erro de codigo postal e exibida")
	public void mensagem_de_erro_de_codigo_postal_e_exibida() {
		metodo.validarMensagem(page.msgErroDados, "Error: Postal Code is required");
	}

}
