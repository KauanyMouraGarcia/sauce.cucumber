package sauce.cucumber.pages;

import sauce.cucumber.elementos.Elementos;
import sauce.cucumber.metodos.Metodos;

public class ClienteLogadoPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void menuHamburguer() {
		metodo.clicar(el.btnBurger);
		metodo.esperar(el.btnLogout);
		
	}

	public void logout() {		
		metodo.clicar(el.btnLogout);
		
		
	
	}

}
