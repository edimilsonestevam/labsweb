package br.sp.edimilsonestevam.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;


public class Compra extends Base{

	public Compra(WebDriver navegador) {
		super(navegador);

	}

	public void AcessarCategoria(String categoria, String subcategoria) {
		
		System.out.println("• Acessando Categoria...");
		
		String vestidos = "dresses";
		String vestidosVerao = "summer";
		
		if((categoria.equalsIgnoreCase(vestidos)) && (subcategoria.equalsIgnoreCase(vestidosVerao))) {	
			String xPathCategoriaDresses = "//body[@id='my-account']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
			String xPathSubcategoriaSummerDresses = "//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Summer Dresses')]";
			
			navegador.findElement(By.xpath(xPathCategoriaDresses)).click();
			navegador.findElement(By.xpath(xPathSubcategoriaSummerDresses)).click();	
		}
		else {
			System.out.println("Dados informados estão errados!");
		}
	}
	
	public void AdicionarProduto(String posicaoProduto) {
		
		System.out.println("• Adicionando Produto...");
		
		if(posicaoProduto.equalsIgnoreCase("1")) {
			String xPathPrimeiraFotoProduto = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//div[@class='product-container']";
			String xPathBotaoAdicionar = "//span[contains(text(),'Add to cart')]";

			navegador.findElement(By.xpath(xPathPrimeiraFotoProduto)).click();
			navegador.findElement(By.xpath(xPathBotaoAdicionar)).click();
		}
		else if(posicaoProduto.equalsIgnoreCase("2")) {
			String xPathSegundoFotoProduto = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-line last-item-of-tablet-line last-mobile-line']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]";
			String xPathBotaoAdicionar = "//span[contains(text(),'Add to cart')]";

			navegador.findElement(By.xpath(xPathSegundoFotoProduto)).click();
			navegador.findElement(By.xpath(xPathBotaoAdicionar)).click();
		}
		else {
			System.out.println("Ainda falta implementar as demais posições dos produtos!");
		}
	}
	
	public void ValidarProdutoAdicionado(String mensagemEsperada) {
		
		System.out.println("• Validando Produto Adicionado...");
		
		try {
			navegador.switchTo().alert();
			
			String xPathMensagemAdicionadoSucesso = "//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]";
			String mensagemAtual = navegador.findElement(By.xpath(xPathMensagemAdicionadoSucesso)).getText();
			
			Assert.assertEquals("Validando se o produto foi adicionado no carrinho", mensagemEsperada, mensagemAtual);
			
		}catch(NoAlertPresentException e) {
			
			System.out.println("--------------------------------------");
			System.out.println("Não foi identificado o Modal!");
			System.out.println("--------------------------------------");
		}
		
	}
	
	public void ValidarDadosCliente(String nomeClienteEsperado, String enderecoClienteEsperado) {
		
		System.out.println("• Validando Dados Cliente...");
		
		String xPathNomeCliente = "//ul[@class='address first_item item box']//span[@class='address_name'][contains(text(),'Edimilson')]";
		String xPathEnderecoCliente = "//ul[@class='address first_item item box']//span[@class='address_address1'][contains(text(),'Avenida Paulista, 171')]";
		
		String nomeCliente = navegador.findElement(By.xpath(xPathNomeCliente)).getText();
		String enderecoCliente = navegador.findElement(By.xpath(xPathEnderecoCliente)).getText();
		
		Assert.assertEquals("Validando o nome do cliente", nomeClienteEsperado, nomeCliente);
		Assert.assertEquals("Validando o endereço do cliente", enderecoClienteEsperado, enderecoCliente);
		
	}
	
	public void FazerCheckout() {
		
		System.out.println("• Fazendo Checkout...");
		
		String xPathBotaoCheckout = "//span[contains(text(),'Proceed to checkout')]";
		
		navegador.findElement(By.xpath(xPathBotaoCheckout)).click();
		
	}
	
	public void ProcederCheckoutProduto() {
		
		System.out.println("• Procedendo Checkout do Produto...");
		
		String xPathBotaoProcederCheckoutProduto = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]";
		
		navegador.findElement(By.xpath(xPathBotaoProcederCheckoutProduto)).click();
	
	}
	
	public void ProcederCheckoutEndereco() {
		
		System.out.println("• Procedendo Checkout do Endereço...");
		
		String xPathBotaoProcederCheckoutEndereco = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]";
		
		navegador.findElement(By.xpath(xPathBotaoProcederCheckoutEndereco)).click();
		
	}
	
	public void AceitarTermo() {
		
		System.out.println("• Aceitando Termo...");
		
		String idTermo = "cgv";
		
		navegador.findElement(By.id(idTermo)).click();
		
	}
	
	public void ProcederCheckoutVenda() {
		
		System.out.println("• Procedendo Checkout da Venda...");
		
		String xPathBotaoProcederCheckoutVenda = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]";
		
		navegador.findElement(By.xpath(xPathBotaoProcederCheckoutVenda)).click();
		
	}
}
