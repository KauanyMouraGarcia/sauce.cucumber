package sauce.cucumber.runner;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.junit.CucumberOptions;
import sauce.cucumber.drivers.Drivers;


/*@CucumberOptions(
    tags = "@Compra",
    features = "src/test/resources/features",
    glue = "sauce.cucumber.steps",
    plugin = {"pretty"},
    monochrome = true,
    dryRun = true
)*/



public class Executa extends Drivers {

	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	public static void finalizarTeste() {
		driver.quit();
	}
	
	


}
