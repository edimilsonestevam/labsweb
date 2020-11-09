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


public class TestSteps{

	protected static WebDriver navegador;
	
	@Before
	@Given("^eu quero cadastrar um usuario no app ToDo$")
	public void eu_quero_cadastrar_um_usuario_no_app_ToDo() throws Throwable {

		navegador = new Configuracao().AbrirNavegador("chrome", "qa-test.avenuecode.com");
	}

	@Test
	@When("^eu clico em Register, informo nome, email, senha, confirmo a senha$")
	public void eu_clico_em_Register_informo_nome_email_senha_confirmo_a_senha() throws Throwable {

		new Usuario(navegador).ClicarRegister().InformarDadosPessoais("Julia Teste75", "juliateste75@gmail.com", "teste123", "teste123");
	}
	
	@Test
	@When("^eu clico no botao Sign up$")
	public void eu_clico_no_botao_Sign_up() throws Throwable {

		new Usuario(navegador).ClicarSignUp();
	}

	@Test
	@Then("^o sistema apresenta a pagina de principal do app ToDo$")
	public void o_sistema_apresenta_a_pagina_de_principal_do_app_ToDo() throws Throwable {
		
		new Home(navegador).ValidarPaginaCorrente("https://qa-test.avenuecode.com/");
	}

	@Test
	@Given("^eu sou um usuario do app ToDo$")
	public void eu_sou_um_usuario_do_app_ToDo() throws Throwable {

		new Home(navegador).ValidarMensagemDepoisQueEstiverLogado("Welcome, Julia Teste75!", "Welcome, Julia Teste75!");
	}

	@Test
	@When("^eu cadastro uma tarefa$")
	public void eu_cadastro_uma_tarefa() throws Throwable {

		new Tarefa(navegador).ClicarMyTasks().InformarNomeDaTarefa("TarefaTeste1").ClicarIconeMais();
		new Tarefa(navegador).InformarNomeDaTarefa("TarefaTeste2").ClicarTeclaEnter();
	}

	@Test
	@Then("^eu vejo a minha tarefa na lista de tarefas$")
	public void eu_vejo_a_minha_tarefa_na_lista_de_tarefas() throws Throwable {

		new Tarefa(navegador).ValidarTarefaCriadaNaListaDeTarefas("//a[contains(text(),'TarefaTeste1')]", "TarefaTeste1");
	}

	@Test
	@When("^eu cadastro uma subtarefa$")
	public void eu_cadastro_uma_subtarefa() throws Throwable {

		new Subtarefa(navegador).ClicarManageSubtasks().ValidarCamposTaskIdETaskDescription();
		new Subtarefa(navegador).InformarDescricaoDaSubtarefaEDataDaSubtarefa("DescricaoTeste1", "01022019").ClicarAddNoModalDaSubtarefa();
		new Subtarefa(navegador).InformarDescricaoDaSubtarefaEDataDaSubtarefa("DescricaoTeste2", "01022019").TeclarEnterNoModalDaSubtarefa();
	}

	@After
	@Then("^eu vejo a subtarefa na lista de subtarefas$")
	public void eu_vejo_a_subtarefa_na_lista_de_subtarefas() throws Throwable {

		new Subtarefa(navegador).VerificarSeExisteSubtarefaCadastradaNalistaDeSubtarefas("//a[contains(text(),'DescricaoTeste1')]", "DescricaoTeste1").ClicarCloseModalSubtasks();
		new Usuario(navegador).ClicarSignOut();
		new Configuracao().FecharNavegador(navegador);
	}
}