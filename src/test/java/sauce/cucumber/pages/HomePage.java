package sauce.cucumber.pages;

import sauce.cucumber.metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();
	LoginPage page = new LoginPage();

	public void login(String usuario, String senha) {
		metodo.escrever(page.usuario, usuario);
		metodo.escrever(page.senha, senha);
		metodo.clicar(page.btnLogin);

	}

	public void validarMensagemDeErro(String mensagem) {
		metodo.validarMensagem(page.msgErro, mensagem);
	}

	public void validarLoginComSucesso() {
		metodo.validarUrl("https://www.saucedemo.com/inventory.html");
	}

	public void preencherUsuario(String usuario) {
		metodo.escrever(page.usuario, usuario);

	}

	public void preencherSenha(String senha) {
		metodo.escrever(page.senha, senha);

	}

	public void enviarDados() {
		metodo.clicar(page.btnLogin);

	}
}
