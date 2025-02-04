package sauce.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauce.cucumber.drivers.Drivers;
import sauce.cucumber.metodos.Metodos;
import sauce.cucumber.pages.CarrinhoPage;
import sauce.cucumber.pages.HomePage;
import sauce.cucumber.runner.Executa;

public class CarrinhoTeste extends Drivers {

	HomePage home = new HomePage();
	CarrinhoPage page = new CarrinhoPage();
	Metodos metodo = new Metodos();	

	@After
	public void finalizar() {
		Executa.finalizarTeste();
	}
	
	@Given("que usuário esteja logado")
	public void que_usuário_esteja_logado() {
		Executa.iniciarTeste();
		home.login("standard_user", "secret_sauce");
	}

	@When("incluir produtos no carrinho")
	public void incluir_produtos_no_carrinho() {
		driver.findElement(page.mochila).click();
		driver.findElement(page.btnAdicionar).click();
	}

	@Then("valida o carrinho")
	public void valida_o_carrinho() {
		driver.findElement(page.mochila);
	}

	@When("remover produtos do carrinho")
	public void remover_produtos_do_carrinho() {
		page.removerDoCarrinho(page.remover);
	}

	@Then("produto removido do carrinho")
	public void produto_removido_do_carrinho() {
		Executa.finalizarTeste();
	}

}
