package sauce.cucumber.pages;

import org.openqa.selenium.By;

import sauce.cucumber.metodos.Metodos;

public class CarrinhoPage {

	Metodos metodo = new Metodos();

	// Produtos
	public By mochila = By.xpath("//*[text()='Sauce Labs Backpack']");

	// Remover do carrinho
	public By remover = By.xpath("//*[@id='remove']");

	//Botão adicionar
	public By btnAdicionar = By.xpath("//*[@id='add-to-cart']");
	
	// Botão carrinho
	public By btnCarrinho = By.xpath("//*[@class='shopping_cart_link']");

	// Botão checkout
	public By btnCheckout = By.xpath("//*[@id='checkout']");

	public void adicionarAoCarrinho() {
		metodo.clicar(mochila);
		metodo.clicar(btnAdicionar);
	
	}

	public void removerDoCarrinho(By elemento) {
		metodo.clicar(elemento);
	}

	public void acessarCarrinho() {
		metodo.clicar(btnCarrinho);
	}

	public void checkout() {
		metodo.clicar(btnCheckout);
	}

}
