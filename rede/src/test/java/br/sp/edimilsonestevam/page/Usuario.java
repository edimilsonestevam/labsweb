package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class Usuario extends Base{

	public Usuario(WebDriver navegador) {
		super(navegador);
		
	}
	
	public void clicarBotaoNovoUsuario() {
		
		navegador.findElement(By.id("id_novo_usuario")).click();
	}
	
	public Usuario informarDadosPessoais(String nome, String email, String apelido, String senha) {
		
		navegador.findElement(By.id("id_usuario")).sendKeys(nome);
		navegador.findElement(By.id("id_email")).sendKeys(email);
		navegador.findElement(By.id("id_apelido")).sendKeys(apelido);
		navegador.findElement(By.id("id_senha")).sendKeys(senha);
		return this;
	}
	
	public void clicarBotaoSalvarUsario() {
		
		navegador.findElement(By.id("id_salvar_usuario")).click();
	}
	
	public void clicarBotaoLimparUsuario() {
		
		navegador.findElement(By.id("id_limpar_usuario")).click();
	}
	
	public void clicarBotaoVoltarUsuario() {
		
		navegador.findElement(By.id("id_voltar_usuario")).click();
	}
	
	public void clicarMenuCodigoUsurio() {
		
		navegador.findElement(By.id("id_consultar_usuario")).click();
	}
	
	public Usuario informarApelido(String apelido) {
		
		navegador.findElement(By.id("id_consultar_apelido_codigo_usuario")).sendKeys(apelido);
		return this;
	}
	
	public void clicarBotaoConsultarApelido() {
		
		navegador.findElement(By.id("id_consultar_codigo_usuario")).click();
	}
	
	public void clicarBotaoLimparApelido() {
		
		navegador.findElement(By.id("id_limpar_codigo_usuario")).click();
	}
	
	public void clicarMenuVoltarCodigoUsuario() {
		
		navegador.findElement(By.id("id_voltar_codigo_usuario")).click();
	}
	
	public void clicarMenuSairCodigoUsuario() {
		
		navegador.findElement(By.id("id_sair_codigo_usuario")).click();
	}
}
