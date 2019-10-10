package br.sp.edimilsonestevam.page;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class Conta extends Base{

	public Conta(WebDriver navegador) {
		super(navegador);
	
	}
	
	public void PreCadastro(String email) {
		
		System.out.println("• Realizando Pré-cadastro...");
		
		String idEmail = "email_create";
		String xPathBotaoCriarConta = "//form[@id='create-account_form']//span[1]";
		
		navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		navegador.findElement(By.id(idEmail)).sendKeys(email);
		navegador.findElement(By.xpath(xPathBotaoCriarConta)).click();
		
	}
	
	public void CadastroInformacaoPessoal(String formaTratamento, String nome, String sobrenome, String senha, String diaNascimento, String mesNascimento, String anoNascimento, String opcaoAssinatura) {
		
		System.out.println("• Realizando Cadastro de Informação Pessoal...");
		
		String idformaTratamentoMasculino = "id_gender1";
		String formaTratamentoMasculino = "Mr";
		String idFormaTratamentoFeminino = "id_gender2";
		String formaTratamentoFeminino = "Mrs";
		String idNome = "customer_firstname";
		String idSobrenome = "customer_lastname";
		String idSenha = "passwd";
		String idDiaNascimento = "days";
		String idMesNascimento = "months";
		String idAnoNascimento = "years";
		String idJornal = "newsletter";
		String jornal = "Jornal";
		String idOferta = "optin";
		String oferta = "Oferta";
		
		
		if(formaTratamento.equalsIgnoreCase(formaTratamentoMasculino)) {
			navegador.findElement(By.id(idformaTratamentoMasculino)).click();
		}
		else if(formaTratamento.equalsIgnoreCase(formaTratamentoFeminino)) {
			navegador.findElement(By.id(idFormaTratamentoFeminino)).click();
		}
		else {
			System.out.println("Você deve informar a forma de tratamento! Ex.: Mr ou Mrs");
		}
		
		navegador.findElement(By.id(idNome)).sendKeys(nome);
		navegador.findElement(By.id(idSobrenome)).sendKeys(sobrenome);
		
		navegador.findElement(By.id(idSenha)).sendKeys(senha);

		navegador.findElement(By.id(idDiaNascimento)).sendKeys(diaNascimento);
		navegador.findElement(By.id(idMesNascimento)).sendKeys(mesNascimento);
		navegador.findElement(By.id(idAnoNascimento)).sendKeys(anoNascimento);
		
		if(opcaoAssinatura.equalsIgnoreCase(jornal)) {
			navegador.findElement(By.id(idJornal)).click();
		}
		else if(opcaoAssinatura.equalsIgnoreCase(oferta)){
			navegador.findElement(By.id(idOferta)).click();
		}
		else {
			System.out.println("Caso você tenha esquecido de informar a opção de assinatura, veja as opções: Jornal ou Oferta");
		}
		
	}
	
	public void CadastroEnderecoPessoal(String compania, String endereco, String complemento, String cidade, String estado,  String cep, String pais, String informacaoAdicional, String telefone, String celular, String apelidoEndereco) {
		
		System.out.println("• Realizando Cadastro de Endereço Pessoal...");
		
		String idCompania = "company";
		String idEndereco = "address1";
		String idComplemento = "address2";
		String idCidade = "city";
		String idEstado = "id_state";
		String idCEP = "postcode";
		String idPais = "id_country";
		String idInformacaoAdicional = "other";
		String idTelefone = "phone";
		String idCelular = "phone_mobile";
		String idApelidoEndereco = "alias";
		String xPathBotaoRegistrar = "//span[contains(text(),'Register')]";
		
		
		navegador.findElement(By.id(idCompania)).sendKeys(compania);
		navegador.findElement(By.id(idEndereco)).sendKeys(endereco);
		navegador.findElement(By.id(idComplemento)).sendKeys(complemento);
		navegador.findElement(By.id(idCidade)).sendKeys(cidade);
		navegador.findElement(By.id(idEstado)).sendKeys(estado);
		navegador.findElement(By.id(idCEP)).sendKeys(cep);
		navegador.findElement(By.id(idPais)).sendKeys(pais);
		navegador.findElement(By.id(idInformacaoAdicional)).sendKeys(informacaoAdicional);
		navegador.findElement(By.id(idTelefone)).sendKeys(telefone);
		navegador.findElement(By.id(idCelular)).sendKeys(celular);
		
		navegador.findElement(By.id(idApelidoEndereco)).clear();
		navegador.findElement(By.id(idApelidoEndereco)).sendKeys(apelidoEndereco);
		
		navegador.findElement(By.xpath(xPathBotaoRegistrar)).click();
		
	}
	
	public void SairConta() {
		
		System.out.println("• Saindo da Conta...");
		
		String xPathBotaoSair = "//a[@class='logout']";
		
		navegador.findElement(By.xpath(xPathBotaoSair)).click();
		
	}
	
	public void ValidandoPaginaCorrente(String nomePagina, String urlEsperada) {
		
		System.out.println("• Validando Página Corrente...");
		
		String paginaCliente = "cliente";
		String paginaCategoria = "categoria";

		if(nomePagina.equalsIgnoreCase(paginaCliente)) {
			String urlAtual = (String) navegador.getCurrentUrl();
			Assert.assertEquals("Validando se está na Página do Cliente", urlEsperada, urlAtual);
		}
		else if(nomePagina.equalsIgnoreCase(paginaCategoria)) {
			String urlAtual = (String) navegador.getCurrentUrl();
			Assert.assertEquals("Validando se está na Página de Categoria", urlEsperada, urlAtual);
		}
		else {
			System.out.println("Dados informados estão errados!");
		}
	}
}
