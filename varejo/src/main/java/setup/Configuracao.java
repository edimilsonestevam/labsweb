package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuracao {

	WebDriver navegador;

	public WebDriver getDriver() {
		return navegador;
	}

	public void setDriver(WebDriver navegador) {
		this.navegador = navegador;
	}

	public WebDriver abrirNavegador(String nomeNavegador, String url) {

		String propriedadeChrome = "webdriver.chrome.driver";
		String propriedadeChromeCaminho = "/Users/edimilsonestevam/Downloads/drivers/chromedriver";
		String propriedadeFirefox = "webdriver.gecko.driver";
		String prorpiedadeFirefoxCaminho = "/Users/edimilsonestevam/Downloads/drivers/geckodriver";

		if (nomeNavegador.equalsIgnoreCase("chrome")) {
			System.setProperty(propriedadeChrome, propriedadeChromeCaminho);
			WebDriver chrome = new ChromeDriver();
			chrome.manage().window().maximize();
			chrome.get(url);
			return chrome;
		} else if (nomeNavegador.equalsIgnoreCase("firefox")) {
			System.setProperty(propriedadeFirefox, prorpiedadeFirefoxCaminho);
			WebDriver firefox = new FirefoxDriver();
			firefox.manage().window().maximize();
			firefox.get(url);
			return firefox;
		} else {
			System.out.println("Ainda falta implementar este navegador, " + nomeNavegador);
		}
		return null;
	}
	
	public void fecharNavegador() {
		navegador.quit();	
	}

}
