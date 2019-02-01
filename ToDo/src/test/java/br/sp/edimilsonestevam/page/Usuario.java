package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class Usuario extends Base{
	
	public Usuario(WebDriver navegador) {
		super(navegador);
	}

	public Usuario clicarRegister() {
		
		navegador.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		return new Usuario(navegador);
	}
	
	public Usuario informarDadosPessoais(String nome, String email, String senha, String confirmarSenha) {
		
		//TRATAR CASO O USUÁRIO JÁ EXISTA NO CADASTRO DO APP ToDo
		
		navegador.findElement(By.id("user_name")).sendKeys(nome);
		navegador.findElement(By.id("user_email")).sendKeys(email);
		navegador.findElement(By.id("user_password")).sendKeys(senha);
		navegador.findElement(By.id("user_password_confirmation")).sendKeys(confirmarSenha);
		return new Usuario(navegador);
	}
	
	public Usuario clicarSignUp() {
		
		navegador.findElement(By.xpath("//input[@value='Sign up']")).click();
		return new Usuario(navegador);
	}
	
	public Usuario clicarSignOut() {
		
		navegador.findElement(By.xpath("//a[@data-method='delete']")).click();
		return new Usuario(navegador);
		
	}
}
