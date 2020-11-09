package br.sp.edimilsonestevam.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuracao {

	protected WebDriver navegador = null;

	public WebDriver getDriver() {
		
		return navegador;
		
	}

	public void setDriver(WebDriver navegador) {
		
		this.navegador = navegador;
		
	}

	public WebDriver AbrirNavegador(String nomeNavegador, String url) {

		System.out.println("-----------------------------------Iniciando os Testes-----------------------------------");
		
		String propriedadeChrome = "webdriver.chrome.driver";
		//String propriedadeChromeCaminho = "C:\\Drivers\\chromedriver.exe";
		String propriedadeChromeCaminho = "/home/edimilson/Drivers/chromedriver";
		String propriedadeFirefox = "webdriver.gecko.driver";
<<<<<<< HEAD
		String prorpiedadeFirefoxCaminho = "C:\\Drivers\\geckodriver.exe";
		String https = "https://";
=======
		//String prorpiedadeFirefoxCaminho = "C:\\Drivers\\geckodriver.exe";
		String prorpiedadeFirefoxCaminho = "/home/edimilson/Drivers/geckodriver";
		String https = "http://";
>>>>>>> 96209b73ea511048d0554ebae0e5a45c328935e7

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
		
		System.out.println("-----------------------------------Terminando os Testes----------------------------------");
		
		this.navegador = navegador;
		navegador.quit();
	}

}