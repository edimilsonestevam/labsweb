package br.sp.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.page.Compra;
import br.sp.edimilsonestevam.page.Conta;
import br.sp.edimilsonestevam.page.Login;
import br.sp.edimilsonestevam.page.Pagamento;
import br.sp.edimilsonestevam.setup.Configuracao;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class TestSteps{

	protected static WebDriver navegador;

	@Dado("^eu estou na pagina para criar uma conta no Automation Pratice http://automationpractice\\.com/index\\.php\\?controller=authentication&back=my-account#account-creation$")
	public void eu_estou_na_pagina_para_criar_uma_conta_no_Automation_Pratice_http_automationpractice_com_index_php_controller_authentication_back_my_account_account_creation() throws Throwable {

		navegador = new Configuracao().AbrirNavegador("chrome", "automationpractice.com");
		new Login(navegador).AcessarLogin();
					
	}

	@Quando("^eu informo o meu e-mail edimilsonestevam@owltechnologies\\.com\\.br$")
	public void eu_informo_o_meu_e_mail_edimilsonestevam_owltechnologies_com_br() throws Throwable {

		new Conta(navegador).PreCadastro("edimilsonestevam@owltechnologies.com.br");
		
	}

	@Quando("^eu informo title Mr\\., first name Edimilson, last name Estevam, password teste(\\d+), date of birth (\\d+), opcao assinar sign up for our newsletter!, company Owl Technologies, address <endereco>, city São Paulo, state São Paulo, zip code (\\d+), country Brasil, mobile phone (\\d+), address alias Corporate$")
	public void eu_informo_title_Mr_first_name_Edimilson_last_name_Estevam_password_teste_date_of_birth_opcao_assinar_sign_up_for_our_newsletter_company_Owl_Technologies_address_endereco_city_São_Paulo_state_São_Paulo_zip_code_country_Brasil_mobile_phone_address_alias_Corporate(int arg1, int arg2, int arg3, int arg4) throws Throwable {

		new Conta(navegador).CadastroInformacaoPessoal("Mr", "Edimilson", "Estevam", "teste123", "1", "January", "2000", "Jornal");
		new Conta(navegador).CadastroEnderecoPessoal("Owl Technologies", "Avenida Paulista, 171", "4º andar", "Palo Alto", "California", "22434", "United States", "Sede", "213-555-0000", "212-999-0000", "Corporate");
	
	}

	@Entao("^o sistema apresenta a pagina principal do site$")
	public void o_sistema_apresenta_a_pagina_principal_do_site() throws Throwable {

		new Conta(navegador).ValidandoPaginaCorrente("Cliente","http://automationpractice.com/index.php?controller=my-account");
		new Conta(navegador).SairConta();
		
	}

	@Dado("^eu estou logado no Automation Pratice http://automationpractice\\.com/index\\.php\\?controller=my-account$")
	public void eu_estou_logado_no_Automation_Pratice_http_automationpractice_com_index_php_controller_my_account() throws Throwable {

		new Login(navegador).FazerLogin("edimilsonestevam@owltechnologies.com.br", "teste123");
		new Conta(navegador).ValidandoPaginaCorrente("Cliente","http://automationpractice.com/index.php?controller=my-account");
		
	}

	@Quando("^eu acesso Summer Dresses$")
	public void eu_acesso_Summer_Dresses() throws Throwable {

		new Compra(navegador).AcessarCategoria("Dresses", "Summer");
		
	}

	@Quando("^eu adiciono o primeiro produto da lista$")
	public void eu_adiciono_o_primeiro_produto_da_lista() throws Throwable {

		new Compra(navegador).AdicionarProduto("1");

	}

	@Entao("^o sistema apresenta o produto escolhido para checkout$")
	public void o_sistema_apresenta_o_produto_escolhido_para_checkout() throws Throwable {

		new Compra(navegador).ValidarProdutoAdicionado("Product successfully added to your shopping cart");
		new Compra(navegador).FazerCheckout();
		new Compra(navegador).ValidarDadosCliente("Edimilson Estevam", "Avenida Paulista, 171 4º andar");
		new Compra(navegador).ProcederCheckoutProduto();
		new Compra(navegador).ProcederCheckoutEndereco();
		new Compra(navegador).AceitarTermo();
		new Compra(navegador).ProcederCheckoutVenda();
		
	}
	
	@Dado("^eu estou comprando no Automation Pratice http://automationpractice\\.com/index\\.php\\?controller=order$")
	public void eu_estou_comprando_no_Automation_Pratice_http_automationpractice_com_index_php_controller_order() throws Throwable {
		
		new Conta(navegador).ValidandoPaginaCorrente("Categoria","http://automationpractice.com/index.php?controller=order&multi-shipping=");
		
	}
	
	@Dado("^eu tenho um produto no carrinho de compras$")
	public void eu_tenho_um_produto_no_carrinho_de_compras() throws Throwable {

		new Compra(navegador).ValidarProdutoAdicionado("Product successfully added to your shopping cart");
		
	}

	@Quando("^eu escolho a forma de pagamento$")
	public void eu_escolho_a_forma_de_pagamento() throws Throwable {

		new Pagamento(navegador).EscolherFormaPagamento("1");
		new Pagamento(navegador).ValidarFormaPagamento("BANK-WIRE PAYMENT.");
		new Pagamento(navegador).ConfirmarPagamento();
		
	}

	@Entao("^o sistema apresenta uma ordem de pagamento$")
	public void o_sistema_apresenta_uma_ordem_pagamento() throws Throwable {

		new Pagamento(navegador).ValidarOrdemPagamento("Your order on My Store is complete.", "Pradeep Macharla", "$30.98");
		new Configuracao().FecharNavegador(navegador);
		
	}
}