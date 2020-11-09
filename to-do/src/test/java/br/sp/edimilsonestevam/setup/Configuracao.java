package br.sp.edimilsonestevam.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuracao {

	protected WebDriver navegador;

	public WebDriver getDriver() {
		
		return navegador;
		
	}

	public void setDriver(WebDriver navegador) {
		
		this.navegador = navegador;
		
	}

	public WebDriver AbrirNavegador(String nomeNavegador, String url) {

		String propriedadeChrome = "webdriver.chrome.driver";
		String propriedadeChromeCaminho = "/Users/edimilsonestevam/Downloads/drivers/chromedriver";
		String propriedadeFirefox = "webdriver.gecko.driver";
		String prorpiedadeFirefoxCaminho = "/Users/edimilsonestevam/Downloads/drivers/geckodriver";
		String https = "https://";

		if (nomeNavegador.equalsIgnoreCase("chrome")) {
			System.setProperty(propriedadeChrome, propriedadeChromeCaminho);
			WebDriver navegador = new ChromeDriver();
			navegador.manage().window().maximize();
			navegador.get(https + url);
			return navegador;
		} else if (nomeNavegador.equalsIgnoreCase("firefox")) {
			System.setProperty(propriedadeFirefox, prorpiedadeFirefoxCaminho);
			WebDriver navegador = new FirefoxDriver();
			navegador.manage().window().maximize();
			navegador.get(https + url);
			return navegador;
		} else {
			System.out.println("Ainda falta implementar este navegador, " + nomeNavegador);
		}
		return null;
	}
	
	public void FecharNavegador(WebDriver navegador) {
		
		this.navegador = navegador;
		navegador.quit();
	}

}