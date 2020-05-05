package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;
import org.junit.Assert;

public class Home extends Base{
	
	public Home(WebDriver navegador) {
		super(navegador);
	}

	/*The user should see a message on the top part saying that list belongs to the logged
	user:
		○ eg.: If the logged user name is John, then the displayed message should be ‘Hey
		John, this is your todo list for today:’
	*/
	public Home ValidarMensagemDepoisQueEstiverLogado(String linkTextDaMensagemDesejada, String mensagemDesejada) {
		
		String mensagemAtual = navegador.findElement(By.linkText(linkTextDaMensagemDesejada)).getText();
		Assert.assertEquals(mensagemDesejada, mensagemAtual);
		return new Home(navegador);
	}
	
	public Home ValidarPaginaCorrente(String urlEsperada) {
		
		Assert.assertEquals(urlEsperada, navegador.getCurrentUrl());
		return new Home(navegador);
	}
}
