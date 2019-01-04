package br.com.soc.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.soc.setup.Base;


public class Pesquisa extends Base{
	
	public Pesquisa(WebDriver navegador) {
		super(navegador);
		
	}

	public Pesquisa pesquisarPorPalavra(String palavraOuFrase) {
		
		String campoPesquisa = "//input[@placeholder='Buscar']";
	
		navegador.findElement(By.xpath(campoPesquisa)).sendKeys(palavraOuFrase);
		return new Pesquisa(navegador);	
		
	}
	
	public Pesquisa confirmarTransacao() {
		
		String iconeLupa = "//input[@type='submit']";
		
		navegador.findElement(By.xpath(iconeLupa)).click();
		return new Pesquisa(navegador);
		
	}
	
	public void validarResultadoPesquisa() {
		
		String resultadoEsperado[] = new String[3];
		resultadoEsperado[0] = "";
		resultadoEsperado[1] = "red hot chilli peppers";
		resultadoEsperado[2] = "teste automatizado";
		
		String resultadoAtual[] = new String[3];
		resultadoAtual[0] = navegador.findElement(By.xpath("//span[contains(text(),'')]")).getText();
		resultadoAtual[1] = navegador.findElement(By.xpath("//span[contains(text(),'red hot chilli peppers')]")).getText();
		resultadoAtual[2] = navegador.findElement(By.xpath("//span[contains(text(),'teste automatizado')]")).getText();
		
		Assert.assertEquals("Resultado: ",resultadoEsperado[0], resultadoAtual[0]);
		Assert.assertEquals("Resultado: ",resultadoEsperado[1], resultadoAtual[1]);
		Assert.assertEquals("Resultado: ",resultadoEsperado[2], resultadoAtual[2]);
		
	}

}
