package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import br.sp.edimilsonestevam.setup.Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

public class Subtarefa extends Base{
	
	public Subtarefa(WebDriver navegador) {
		super(navegador);
	}
	
	//The user should see a button labeled as ‘Manage Subtasks’
	public void verificarSeExisteBotaoManageSubtasks(String xPathBotaoManageSubtasks, String botaoDesejado) {
		
		String botaoAtual = navegador.findElement(By.xpath(xPathBotaoManageSubtasks)).getText();
		
		Assert.assertEquals(botaoDesejado, botaoAtual);
	}

	//This button should have the number of subtasks created for that tasks
	public void verificarNumeroDeSubtarefasNoBotaoManageSubtasks(String nomeDoClassNameDoBotaoManageSubtasks, String nomeLabelManageSubtasks) {
		
		String nomeDoClasseName = navegador.findElement(By.className(nomeDoClassNameDoBotaoManageSubtasks)).getText();
		
		Assert.assertEquals(nomeLabelManageSubtasks, nomeDoClasseName);
	}
	
	//Clicking this button opens up a modal dialog
	public Subtarefa clicarManageSubtasks() {
		
		navegador.findElement(By.xpath("//button[@class='btn btn-xs btn-primary ng-binding']")).click();
		return new Subtarefa(navegador);
	}
	
	//This pop up should have a read only field with the task ID and the task description
	public void validarCamposTaskIdETaskDescription() {
	
		String xPathDoNomeDaTarefa = "//h3[@class='modal-title ng-binding']";
		
		navegador.findElement(By.xpath(xPathDoNomeDaTarefa));
		
		File scrFile = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("/Users/edimilsonestevam/Downloads/validarCamposTaskIdETaskDescription.jpg"));
		} 
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	
	//There should be a form so you can enter the SubTask Description (250 characters) and SubTask due date (MM/dd/yyyy format)
	//The Task Description and Due Date are required fields
	public Subtarefa informarDescricaoDaSubtarefaEDataDaSubtarefa(String descricaoDaSubtarefa, String dataDaSubtarefa) {
		
		navegador.findElement(By.xpath("//input[@id='new_sub_task']")).sendKeys(descricaoDaSubtarefa);
		navegador.findElement(By.xpath("//input[@id='dueDate']")).clear();
		navegador.findElement(By.xpath("//input[@id='dueDate']")).sendKeys(dataDaSubtarefa);
		return new Subtarefa(navegador);
	}

	//The user should click on the add button to add a new Subtask
	public void clicarAddNoModalDaSubtarefa() {
		
		navegador.findElement(By.xpath("//button[@id='add-subtask']")).click();	
	}

	//Subtasks that were added should be appended on the bottom part of the modal dialog
	public void teclarEnterNoModalDaSubtarefa() {
		
		navegador.findElement(By.xpath("//button[@id='add-subtask']")).sendKeys(Keys.ENTER);	
	}
	
	public Subtarefa verificarSeExisteSubtarefaCadastradaNalistaDeSubtarefas(String xPtahDaSubtarefaCriada, String nomeDaSubtarefaCriada) {
		
		String subtarefaCriada = navegador.findElement(By.xpath(xPtahDaSubtarefaCriada)).getText();
		
		Assert.assertEquals(nomeDaSubtarefaCriada, subtarefaCriada);
		
		return new Subtarefa(navegador);
	}
	
	public void clicarCloseModalSubtasks() {
		
		navegador.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
	}
}
