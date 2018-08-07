package br.sp.edimilsonestevam.stepdefinition;

import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.page.CaixaDeEntrada;
import br.sp.edimilsonestevam.page.Home;
import br.sp.edimilsonestevam.page.Login;
import br.sp.edimilsonestevam.setup.Configuracao;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class PassosDeTestes{
	
	protected WebDriver navegador;
	
	@Dado("^Usuario esta na Pagina Principal <site>$")
	public void usuario_esta_na_Pagina_Principal_site() throws Throwable {
				
		navegador = new Configuracao().abrirNavegador("firefox", "www.outlook.live.com/owa");
	    throw new PendingException();
	    
	}

	@Quando("^Usuario navega até a Pagina de Login$")
	public void usuario_navega_até_a_Pagina_de_Login() throws Throwable {

	 	new Home(navegador).clicarLinkSignIn();
	    throw new PendingException();
	    
	}

	@Quando("^Usuario informar e-mail <email> e clicar no botao Proximo$")
	public void usuario_informar_e_mail_email_e_clicar_no_botao_Proximo() throws Throwable {
		
		new Login(navegador).informarEmail("testeEEC@outlook.com");
	    throw new PendingException();
	    
	}

	@Quando("^Usuario informar senha <senha> e clicar no botao Login$")
	public void usuario_informar_senha_senha_e_clicar_no_botao_Login() throws Throwable {
		
		new Login(navegador).informarSenha("Teste123456");
	    throw new PendingException();
	    
	}

	@Entao("^Usuario visualiza a Caixa de entrada de e-mail$")
	public void usuario_visualiza_a_Caixa_de_entrada_de_e_mail(DataTable arg1) throws Throwable {

		new CaixaDeEntrada(navegador).visualizarCaixaDeEntrada();
	    throw new PendingException();
	    
	}
	
}
