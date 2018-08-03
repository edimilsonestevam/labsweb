package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import page.CaixaDeEntrada;
import page.Login;
import setup.Configuracao;


public class PassosDeTestes {
	
	private WebDriver navegador;
	
	@Dado("^Usuario esta na Pagina Principal <site>$")
	public void usuario_esta_na_Pagina_Principal_site() throws Throwable {
	    
		Configuracao navegador = new Configuracao();
		navegador.abrirNavegador("firefox", "https://outlook.live.com/owa/");
	    throw new PendingException();
	    
	}

	@Quando("^Usuario navega até a Pagina de Login$")
	public void usuario_navega_até_a_Pagina_de_Login() throws Throwable {
	 	
		Login usuario = new Login(navegador);
	 	usuario.clicarLinkSignIn();
	    throw new PendingException();
	}

	@Quando("^Usuario informar e-mail <email> e clicar no botao Proximo$")
	public void usuario_informar_e_mail_email_e_clicar_no_botao_Proximo() throws Throwable {
	    
		Login bia = new Login(navegador);
		bia.informarEmail("testeEEC@outlook.com");
	    throw new PendingException();
	}

	@Quando("^Usuario informar senha <senha> e clicar no botao Login$")
	public void usuario_informar_senha_senha_e_clicar_no_botao_Login() throws Throwable {

		Login bia = new Login(navegador);
		bia.informarSenha("Teste123456");
	    throw new PendingException();
	}

	@Entao("^Usuario visualiza a Caixa de entrada de e-mail$")
	public void usuario_visualiza_a_Caixa_de_entrada_de_e_mail(DataTable arg1) throws Throwable {

		CaixaDeEntrada bia = new CaixaDeEntrada(navegador);
		bia.visualizarCaixaDeEntrada();
	    throw new PendingException();
	}
	
}
