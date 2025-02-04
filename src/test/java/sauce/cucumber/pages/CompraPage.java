package sauce.cucumber.pages;

import org.openqa.selenium.By;

import sauce.cucumber.metodos.Metodos;

public class CompraPage {

	Metodos metodo = new Metodos();

	// Campos para realizar a compra
	public By campoFirstName = By.xpath("//*[@id='first-name']");
	public By campoLastName = By.xpath("//*[@id='last-name']");
	public By campoPCode = By.xpath("//*[@id='postal-code']");

	// Botão carrinho
	public By btnCarrinho = By.xpath("//*[@class='shopping_cart_link']");

	// Botão continue
	public By btnContinue = By.xpath("//*[@id='continue']");

	// Botão back home
	public By btnBackHome = By.xpath("//*[@id='back-to-products']");

	// Botão checkout
	public By btnCheckout = By.xpath("//*[@id='checkout']");

	// Botão finish
	public By btnFinish = By.xpath("//*[@id='finish']");

	// Mensagem de compra com sucesso
	public By msgSucesso = By.xpath("//*[@class='complete-header']");
	
	//Mensagem de erro de dados em branco/sem First Name/sem Last Name/sem cep
	public By msgErroDados = By.xpath("//h3[@data-test='error']");
	

	public void preencherDadosPessoais(String nome, String sobrenome, String cep) {
		metodo.escrever(campoFirstName, nome);
		metodo.escrever(campoLastName, sobrenome);
		metodo.escrever(campoPCode, cep);
	}

	public void finalizarCompra() {
		metodo.clicar(btnContinue);
		metodo.clicar(btnFinish);

	}

	public void clicarEmContinue() {
		metodo.clicar(btnContinue);
	}

	public void voltarParaHome() {
		metodo.clicar(btnBackHome);
	}

}
