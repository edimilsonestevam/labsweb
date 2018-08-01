package br.sp.edimilsonestevam.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class Subtarefa extends Base{

	public Subtarefa(WebDriver navegador) {
		super(navegador);
		
	}

	public void clicarMenuAdicionarSubtarefa() {
		
		navegador.findElement(By.id("id_adicionar_subtarefa")).click();
	}
	
	public Subtarefa informarSubtarefa(String subtarefa, String descricao, String data, String codigoTarefa) {
		
		navegador.findElement(By.id("id_subtarefa")).sendKeys(subtarefa);
		navegador.findElement(By.id("id_ds_subarefa")).sendKeys(descricao);
		navegador.findElement(By.id("dt_criacao_subtarefa")).sendKeys(data);
		navegador.findElement(By.id("id_tarefa")).sendKeys(codigoTarefa);
		return this;
	}
	
	public void clicarBotaoSalvarAdicionarSubtarefa() {
		
		navegador.findElement(By.id("id_salvar_subarefa")).click();
	}
	
	public void clicarBotaoLimparAdicionarSubtarefa() {
		
		navegador.findElement(By.id("id_limpar_subtarefa")).click();
	}
	
	public void clicarMenuVoltarAdicionarSubtarefa() {
		
		navegador.findElement(By.id("id_voltar_subtarefa")).click();
	}
	
	public void clicarMenuSairAdicionarSubtarefa() {
		
		navegador.findElement(By.id("id_sair_cadastrar_subtarefa")).click();
	}
	
}
