package br.sp.edimilsonestevam.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class Tarefa extends Base{

	public Tarefa(WebDriver navegador) {
		super(navegador);
		
	}

	public void clicarMenuAdicionarTarefa() {
		
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.findElement(By.id("id_adicionar_tarefa")).click();
	}
	
	public Tarefa informarTarefa(String tarefa, String descricao, String data, String codigoUsuarioLogado) {
		
		navegador.findElement(By.id("id_tarefa")).sendKeys(tarefa);
		navegador.findElement(By.id("id_ds_tarefa")).sendKeys(descricao);
		navegador.findElement(By.id("dt_criacao_tarefa")).sendKeys(data);
		navegador.findElement(By.id("dt_criacao_tarefa")).sendKeys(Keys.TAB);
		navegador.findElement(By.id("id_usuario")).sendKeys(codigoUsuarioLogado);
		return this;
	}
	
	public void clicarBotaoSalvarAdicionarTarefa() {
		
		navegador.findElement(By.id("id_salvar_tarefa")).click();
	}
	
	public void clicarBotaoLimparAdicionarTarefa() {
		
		navegador.findElement(By.id("id_limpar_tarefa")).click();
	}
	
	public void clicarMenuVoltarAdicionarTarefa() {
		
		navegador.findElement(By.id("id_voltar_tarefa")).click();
	}
	
	public void clicarMenuSairAdicionarTarefa() {
		
		navegador.findElement(By.id("id_sair_cadastrar_tarefa")).click();
	}
}
