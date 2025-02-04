package sauce.cucumber.metodos;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sauce.cucumber.drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void validarMensagem(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, textoEsperado);
	}

	public void validarUrl(String urlEsperado) {
		assertEquals(urlEsperado, driver.getCurrentUrl());
	}

	public void clicarPorTexto(String atributo, String texto) {
		driver.findElement(By.xpath("//" + atributo + "[text()='" + texto + "']")).click();

	}
	public void esperar(By xpath) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
	}

	
		
	}


