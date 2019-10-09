package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;
import org.junit.Assert;

public class Pagamento extends Base{

	public Pagamento(WebDriver navegador) {
		super(navegador);

	}

	public void EscolherFormaPagamento(String opcaoFormaPagamento) {
		
		System.out.println("• Escolhendo Forma de Pagamento...");
		
		if(opcaoFormaPagamento.equalsIgnoreCase("1")) {
			String xPathBankWire = "//a[@class='bankwire']";
			navegador.findElement(By.xpath(xPathBankWire)).click();
		}
		else if(opcaoFormaPagamento.equalsIgnoreCase("2")) {
			String xPathCheck = "//a[@class='cheque']";
			navegador.findElement(By.xpath(xPathCheck)).click();
		}
		else {
			System.out.println("Você deve informar a forma de pagamento! Ex.: 1 para Pay by bank wire ou 2 para Pay by check");
		}
	}
	
	public void ValidarFormaPagamento(String mensagemEsperada) {
		
		System.out.println("• Validando Forma de Pagamento...");
		
		String xPathMensagem = "//h3[@class='page-subheading']";
		String mensagemAtual = navegador.findElement(By.xpath(xPathMensagem)).getText();
		
		Assert.assertEquals("Validando se a forma de pagamento foi feita", mensagemEsperada, mensagemAtual);

	}
	
	public void ConfirmarPagamento() {
		
		System.out.println("• Confirmando Pagamento...");
		
		String xPathBotaoOrdemPagamento = "//span[contains(text(),'I confirm my order')]";
		navegador.findElement(By.xpath(xPathBotaoOrdemPagamento)).click();
		
	}
	
	public void ValidarOrdemPagamento(String mensagemOrdemPagamentoEsperada, String nomeProdutoEsperado, String valorProdutoEsperado) {
		
		System.out.println("• Validando Ordem de Pagamento...");
		
		String xPathMensagemOrdemPagamento = "//p[@class='cheque-indent']"; 
		String xPathValorProduto = "//strong[contains(text(),'$30.98')]";
		String xPathNomeProduto = "//strong[contains(text(),'Pradeep Macharla')]";

		String mensagemOrdemPagamentoAtual = navegador.findElement(By.xpath(xPathMensagemOrdemPagamento)).getText();
		String nomeProdutoAtual = navegador.findElement(By.xpath(xPathNomeProduto)).getText();
		String valorProdutoAtual = navegador.findElement(By.xpath(xPathValorProduto)).getText();
	
		Assert.assertEquals("Validando a mensagem da ordem de pagamento", mensagemOrdemPagamentoEsperada, mensagemOrdemPagamentoAtual);
		Assert.assertEquals("Validando o nome do produto", nomeProdutoEsperado, nomeProdutoAtual);
		Assert.assertEquals("Validando o valor do produto", valorProdutoEsperado, valorProdutoAtual);
		
	}
}
