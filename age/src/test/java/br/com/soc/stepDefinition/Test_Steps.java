package br.com.soc.stepDefinition;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.soc.page.Pesquisa;
import br.com.soc.setup.Configuracao;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_Steps {

	protected WebDriver navegador;
	
	@BeforeClass
	@Given("^eu estou na pagina principal do SOC$")
	public void eu_estou_na_pagina_principal_do_SOC() throws Throwable {
		
		navegador = new Configuracao().abrirNavegador("chrome", "ww2.soc.com.br/blog/");		
		
	}

	@Test
	@When("^eu digito  no campo de busca$")
	public void eu_digito_no_campo_de_busca() throws Throwable {

		new Pesquisa(navegador).pesquisarPorPalavra("");
		
	}

	@Test
	@When("^eu digito red hot chilli peppers no campo de busca$")
	public void eu_digito_red_hot_chilli_peppers_no_campo_de_busca() throws Throwable {

		new Pesquisa(navegador).pesquisarPorPalavra("red hot chilli peppers");
		
	}
	
	@Test
	@When("^eu digito teste automatizado no campo de busca$")
	public void eu_digito_teste_automatizado_no_campo_de_busca() throws Throwable {
		
		new Pesquisa(navegador).pesquisarPorPalavra("teste automatizado");
		
	}

	@Test
	@When("^eu confirmo a transacao$")
	public void eu_confirmo_a_transacao() throws Throwable {
		
		new Pesquisa(navegador).confirmarTransacao();
		
	}

	@Test
	@Then("^sistema exibe o resultado da busca$")
	public void sistema_exibe_o_resultado_da_busca() throws Throwable {
		
		new Pesquisa(navegador).validarResultadoPesquisa();
		
	}

	@AfterClass
	@Then("^navegador será fechado$")
	public void navegador_será_fechado(DataTable arg1) throws Throwable {
		
		new Pesquisa(navegador).fecharNavegador(navegador);
		
	}

}
