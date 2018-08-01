package br.sp.edimilsonestevam.setup;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class Base {

	protected WebDriver navegador;
	
	public Base(WebDriver navegador) {
		
		this.navegador = navegador;
		
	}
	
	public Base validarPaginaEsperada(String paginaEsperada) {
		
		String paginaAtual = navegador.getCurrentUrl();
		Assert.assertEquals(paginaEsperada, paginaAtual);
		return this;
	}
}
