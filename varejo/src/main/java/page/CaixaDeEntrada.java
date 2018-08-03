package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class CaixaDeEntrada {
	
	private WebDriver navegador;
	
	public CaixaDeEntrada(WebDriver navegador) {
		this.navegador = navegador;		
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
