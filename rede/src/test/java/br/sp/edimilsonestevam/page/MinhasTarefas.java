package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class MinhasTarefas extends Base{

	public MinhasTarefas(WebDriver navegador) {
		super(navegador);
		
	}
	
	public void clicarMenuMinhasTarefas() {
		
		navegador.findElement(By.id("id_minhas_tarefas")).click();
	}
	
	public MinhasTarefas informarCodigoTarefa(int codigo) {
		
		navegador.findElement(By.id("id_tarefa_minhas_tarefas")).sendKeys("codigo");
		return this;
	}
	
	public MinhasTarefas informarNomeTarefa(String nome) {
		
		navegador.findElement(By.id("id_nm_tarefa_minhas_tarefas")).sendKeys(nome);
		return this;
	}
	
	public void clicarBotaoConsultarMinhasTarefas() {
		
		navegador.findElement(By.id("id_salvar_minhas_tarefas")).click();
	}
	
	public void clicarBotaoLimparMinhasTarefas() {
		
		navegador.findElement(By.id("id_limpar_minhas_tarefas")).click();
	}
	
	public void clicarMenuVoltar() {
		
		navegador.findElement(By.id("id_voltar_minhas_tarefas")).click();
	}
	
	public void clicarMenuSair() {
		
		navegador.findElement(By.id("id_sair_minhas_tarefas")).click();
	}
}
