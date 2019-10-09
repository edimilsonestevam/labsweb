package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class Tarefa extends Base{

	public Tarefa(WebDriver navegador) {
		super(navegador);
	}
	
	//The user should always see the ‘My Tasks’ link on the NavBar
	public void VerMinhasTarefasNoMenu(String minhaTarefaCriada, String xPathDaTarefaCriada) {
		
		String minhaTarefaAtual = navegador.findElement(By.xpath(xPathDaTarefaCriada)).getText();
		
		Assert.assertEquals(minhaTarefaCriada, minhaTarefaAtual);
	}
	
	//Clicking this link will redirect the user to a page with all the created tasks so far
	public void ValidarRedirecionamentoDePagina(String paginaDesejada) {
		
		 Assert.assertEquals(paginaDesejada, navegador.getCurrentUrl());
	}
	
	//The user should be able to enter a new task by hitting enter or clicking on the add task button
	public Tarefa InformarNomeDaTarefa(String nomeDaTarefa) {
		
		navegador.findElement(By.id("new_task")).sendKeys(nomeDaTarefa);
		return this;
	}
	
	public Tarefa ClicarTeclaEnter() {
		
		navegador.findElement(By.id("new_task")).sendKeys(Keys.ENTER);
		navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return this;
	}
	
	public Tarefa ClicarIconeMais(){
		
		navegador.findElement(By.xpath("//span[@class='input-group-addon glyphicon glyphicon-plus']")).click();
		navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return this;
	}

	//The task should require at least three characters so the user can enter it
	public Tarefa VerificarQuantidadeMinimaDeCaracteres(String nomeDaTarefa) {
		
		if(nomeDaTarefa.length() >= 3) {
			return new Tarefa(navegador);
		}
		else {
			System.out.println("O nome da Tarefa deve ter no mínimo 3 caracteres!");
			return new Tarefa(navegador);
		}
	}
	
	//The task can’t have more than 250 characters
	public Tarefa VerificarQuantidadeMaximaDeCaracteres(String nomeDaTarefa) {
		
		if(nomeDaTarefa.length() <= 250) {
			return new Tarefa(navegador);
		}
		else {
			System.out.println("O nome da Tarefa deve ter no máximo 250 caracteres!");
			return new Tarefa(navegador);
		}
	}
	
	//When added, the task should be appended on the list of created tasks
	public void ValidarTarefaCriadaNaListaDeTarefas(String xPathDaTarefaCriada, String nomeDaTarefaCriada) {
		
		String tarefaCriada = navegador.findElement(By.xpath(xPathDaTarefaCriada)).getText();
		
		Assert.assertEquals(nomeDaTarefaCriada, tarefaCriada);
	}
	
	public Tarefa ClicarMyTasks() {
		
		navegador.findElement(By.xpath("//a[@class='btn btn-lg btn-success']")).click();
		return new Tarefa(navegador);
	}
}
