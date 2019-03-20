package br.sp.edimilsonestevam.stepDefinition;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.page.Home;
import br.sp.edimilsonestevam.page.Subtarefa;
import br.sp.edimilsonestevam.page.Tarefa;
import br.sp.edimilsonestevam.page.Usuario;
import br.sp.edimilsonestevam.setup.Configuracao;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_Steps{

	protected static WebDriver navegador;
	
	@Before
	@Given("^eu quero cadastrar um usuario no app ToDo$")
	public void eu_quero_cadastrar_um_usuario_no_app_ToDo() throws Throwable {

		navegador = new Configuracao().abrirNavegador("chrome", "qa-test.avenuecode.com");
	}

	@Test
	@When("^eu clico em Register, informo nome, email, senha, confirmo a senha$")
	public void eu_clico_em_Register_informo_nome_email_senha_confirmo_a_senha() throws Throwable {

		new Usuario(navegador).clicarRegister().informarDadosPessoais("Julia Teste70", "juliateste70@gmail.com", "teste123", "teste123");
	}
	
	@Test
	@When("^eu clico no botao Sign up$")
	public void eu_clico_no_botao_Sign_up() throws Throwable {

		new Usuario(navegador).clicarSignUp();
	}

	@Test
	@Then("^o sistema apresenta a pagina de principal do app ToDo$")
	public void o_sistema_apresenta_a_pagina_de_principal_do_app_ToDo() throws Throwable {
		
		new Home(navegador).validarPaginaCorrente("https://qa-test.avenuecode.com/");
	}

	@Test
	@Given("^eu sou um usuario do app ToDo$")
	public void eu_sou_um_usuario_do_app_ToDo() throws Throwable {

		new Home(navegador).validarMensagemDepoisQueEstiverLogado("Welcome, Julia Teste70!", "Welcome, Julia Teste70!");
	}

	@Test
	@When("^eu cadastro uma tarefa$")
	public void eu_cadastro_uma_tarefa() throws Throwable {

		new Tarefa(navegador).clicarMyTasks().informarNomeDaTarefa("TarefaTeste1").clicarIconeMais();
		new Tarefa(navegador).informarNomeDaTarefa("TarefaTeste2").clicarTeclaEnter();
	}

	@Test
	@Then("^eu vejo a minha tarefa na lista de tarefas$")
	public void eu_vejo_a_minha_tarefa_na_lista_de_tarefas() throws Throwable {

		new Tarefa(navegador).validarTarefaCriadaNaListaDeTarefas("//a[contains(text(),'TarefaTeste1')]", "TarefaTeste1");
	}

	@Test
	@When("^eu cadastro uma subtarefa$")
	public void eu_cadastro_uma_subtarefa() throws Throwable {

		new Subtarefa(navegador).clicarManageSubtasks().validarCamposTaskIdETaskDescription("TarefaTeste3");
		new Subtarefa(navegador).informarDescricaoDaSubtarefaEDataDaSubtarefa("DescricaoTeste1", "01022019").clicarAddNoModalDaSubtarefa();
		new Subtarefa(navegador).informarDescricaoDaSubtarefaEDataDaSubtarefa("DescricaoTeste2", "01022019").teclarEnterNoModalDaSubtarefa();
	}

	@After
	@Then("^eu vejo a subtarefa na lista de subtarefas$")
	public void eu_vejo_a_subtarefa_na_lista_de_subtarefas() throws Throwable {

		new Subtarefa(navegador).verificarSeExisteSubtarefaCadastradaNalistaDeSubtarefas("//a[contains(text(),'DescricaoTeste1')]", "DescricaoTeste1").clicarCloseModalSubtasks();
		new Usuario(navegador).clicarSignOut();
		new Configuracao().fecharNavegador(navegador);
	}
}