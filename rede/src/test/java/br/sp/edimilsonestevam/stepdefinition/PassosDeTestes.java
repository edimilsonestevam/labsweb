package br.sp.edimilsonestevam.stepdefinition;

import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.page.Login;
import br.sp.edimilsonestevam.page.Subtarefa;
import br.sp.edimilsonestevam.page.Tarefa;
import br.sp.edimilsonestevam.setup.Configuracao;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PassosDeTestes {

	protected WebDriver navegador;
	
	//CADASTRAR TAREFA
	@Given("^eu estou logado na aplicacao e quero cadastrar uma tarefa$")
	public PassosDeTestes eu_estou_logado_na_aplicacao_e_quero_cadastrar_uma_tarefa() throws Throwable {
	    
		navegador = new Configuracao().abrirNavegador("chrome", "localhost/aplicacao/Login.php");
		new Login(navegador).realizarLogin("edimilsonestevam", "teste123");
		new Tarefa(navegador).clicarMenuAdicionarTarefa();
		return this;
	}

	@When("^eu informo nome da tarefa <nomeTarefa>, descricao da tarefa <descricaoTarefa>, data de criacao da tarefa <dtCriacaoTarefa>, codigo do usuario logado <cdUsuarioLogado> e clico no botao Salvar$")
	public PassosDeTestes eu_informo_nome_da_tarefa_nomeTarefa_descricao_da_tarefa_descricaoTarefa_data_de_criacao_da_tarefa_dtCriacaoTarefa_codigo_do_usuario_logado_cdUsuarioLogado_e_clico_no_botao_Salvar() throws Throwable {
	    
		new Tarefa(navegador).informarTarefa("Tarefa1", "Descrição1", "30072018", "1").clicarBotaoSalvarAdicionarTarefa();
		return this;
	}

	@Then("^o sistema salva a minha tarefa e redireciona para a tela Principal <telaPrincipal>$")
	public PassosDeTestes o_sistema_salva_a_minha_tarefa_e_redireciona_para_a_tela_Principal_telaPrincipal(DataTable arg1) throws Throwable {
	   
		new Login(navegador).validarPaginaEsperada("http://localhost/aplicacao/Principal.php");
	    return this;
	}
}
