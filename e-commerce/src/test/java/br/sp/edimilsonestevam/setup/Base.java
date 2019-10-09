package br.sp.edimilsonestevam.setup;

import org.openqa.selenium.WebDriver;


public class Base {

	protected WebDriver navegador;
	
	public Base(WebDriver navegador) {
		
		this.navegador = navegador;
		
	}
	
}