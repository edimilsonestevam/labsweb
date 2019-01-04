package br.com.soc.setup;

import org.openqa.selenium.WebDriver;


public class Base extends Configuracao{

	protected WebDriver navegador;
	
	public Base(WebDriver navegador) {
		
		this.navegador = navegador;
		
	}

}
