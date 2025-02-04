package sauce.cucumber.steps;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauce.cucumber.pages.HomePage;
import sauce.cucumber.runner.Executa;

public class LoginTeste {

	@After
	public void finalizar() {
		Executa.finalizarTeste();
	}

	HomePage home = new HomePage();

	@Given("que esteja na tela de Login")
	public void que_esteja_na_tela_de_login() {
		Executa.iniciarTeste();
	}

	@When("enviar usuario e senha")
	public void enviar_usuario_e_senha() {
		home.login("standard_user", "secret_sauce");
	}

	@Then("acesso a conta")
	public void acesso_a_conta() {
		home.validarLoginComSucesso();

	}

	@Given("informar usuario correto")
	public void informar_usuario_correto() {
		home.preencherUsuario("standard_user");
	}

	@Given("informar senha invalida")
	public void informar_senha_invalida() {
		home.preencherSenha("senhaInvalida");
	}

	@When("enviar os dados")
	public void enviar_os_dados() {
		home.enviarDados();
	}

	@Then("recebo a mensagem de senha invalida")
	public void recebo_a_mensagem_de_senha_invalida() {
		home.validarMensagemDeErro("Epic sadface: Username and password do not match any user in this service");

	}

	@Given("informar usuario invalido")
	public void informar_usuario_invalido() {
		home.preencherUsuario("usuarioInvalido");
	}

	@Given("informar senha correta")
	public void informar_senha_correta() {
		home.preencherSenha("secret_sauce");
	}

	@Then("recebo a mensagem de usuario invalido")
	public void recebo_a_mensagem_de_usuario_invalido() {
		home.validarMensagemDeErro("Epic sadface: Username and password do not match any user in this service");

	}

	@Given("informar usuario bloqueado")
	public void informar_usuario_bloqueado() {
		home.preencherUsuario("locked_out_user");
	}

	@Then("recebo a mensagem de usuario bloqueado")
	public void recebo_a_mensagem_de_usuario_bloqueado() {
		home.validarMensagemDeErro("Epic sadface: Sorry, this user has been locked out.");
	}

	@Then("recebo a mensagem {string}")
	public void recebo_a_mensagem(String msg) {
		home.validarMensagemDeErro(msg);

	}
}
