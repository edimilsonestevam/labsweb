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

	public WebDriver abrirNavegador(String nomeNavegador, String url) {

		System.out.println("-----------------------------------Iniciando os Testes-----------------------------------");
		
		String propriedadeChrome = "webdriver.chrome.driver";
		String propriedadeChromeCaminho = "C:\\Drivers\\chromedriver.exe";
		String propriedadeFirefox = "webdriver.gecko.driver";
		String prorpiedadeFirefoxCaminho = "C:\\Drivers\\geckodriver.exe";
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
	
	public void fecharNavegador(WebDriver navegador) {
		
		System.out.println("-----------------------------------Terminando os Testes----------------------------------");
		
		this.navegador = navegador;
		navegador.quit();
	}

}