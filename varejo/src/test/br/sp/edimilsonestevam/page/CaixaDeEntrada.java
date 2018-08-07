package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

import org.junit.Assert;

public class CaixaDeEntrada extends Base{
	
	public CaixaDeEntrada(WebDriver navegador) {
		
		super(navegador);
		
	}
	
	public CaixaDeEntrada visualizarCaixaDeEntrada() {
		
		String urlEsperada = "https://outlook.live.com/mail/inbox";
		String urlAtual = navegador.getCurrentUrl();
		
		Assert.assertEquals(urlEsperada, urlAtual);
		return this;
	}

	public CaixaDeEntrada enviarNovaMensagem(int quantidadeDeNovaMensagem) {
		
		String novaMensagem = "//div[@class='ms-OverflowSet ms-CommandBar-primaryCommand primarySet-69']//div[1]//button[1]";
						
		for(int i = 0; i <= quantidadeDeNovaMensagem; i++) {
			
			navegador.findElement(By.xpath(novaMensagem)).click();
			
		}
		 return this;
	}
}
