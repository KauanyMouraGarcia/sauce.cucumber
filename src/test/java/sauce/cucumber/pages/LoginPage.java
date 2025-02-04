package sauce.cucumber.pages;

import org.openqa.selenium.By;

public class LoginPage {

	public By usuario = By.xpath("//*[@id='user-name']");
	public By senha = By.xpath("//*[@id='password']");
	public By btnLogin = By.xpath("//*[@id='login-button']");
	public By msgErro = By.xpath("//h3[@data-test='error']");
	
}
