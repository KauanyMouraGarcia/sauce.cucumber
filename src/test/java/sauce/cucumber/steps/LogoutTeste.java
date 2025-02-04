package sauce.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauce.cucumber.pages.ClienteLogadoPage;
import sauce.cucumber.pages.HomePage;
import sauce.cucumber.runner.Executa;

public class LogoutTeste {

	ClienteLogadoPage logado = new ClienteLogadoPage();
	HomePage home = new HomePage();
	
	@After
	public void finalizar() {
		Executa.finalizarTeste();
	}

	@Given("que o usuario esteja logado")
	public void que_o_usuario_esteja_logado() {
		Executa.iniciarTeste();
		home.login("standard_user", "secret_sauce");
	}

	@When("clicar em logout")
	public void clicar_em_logout() {
		logado.menuHamburguer();	
		logado.logout();
	
	}

	@Then("volta para tela de login")
	public void volta_para_tela_de_login() {
		Executa.finalizarTeste();
	}

}
