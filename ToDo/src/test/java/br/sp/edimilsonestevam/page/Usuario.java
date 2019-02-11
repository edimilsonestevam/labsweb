package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class Usuario extends Base{
	
	public Usuario(WebDriver navegador) {
		super(navegador);
	}

	public Usuario clicarRegister() {
		
		String mensagemDeErro = navegador.findElement(By.xpath("//a[contains(text(),'Register')]")).getText();
		
		if(mensagemDeErro.isEmpty()) {
			System.out.println("--------------------------------clicarRegister()--------------------------------");
			System.out.println("Elemento Register está vazio!");
			System.out.println("--------------------------------------------------------------------------------");
			return new Usuario(navegador);
		}
		else {
			navegador.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
			return new Usuario(navegador);
		}
	}
	
	public Usuario informarDadosPessoais(String nome, String email, String senha, String confirmarSenha) {
		
		String mensagemDeErro = navegador.findElement(By.xpath("//li[contains(text(),'Email has already been taken')]")).getText();
		
		if(mensagemDeErro.isEmpty()) {
			navegador.findElement(By.id("user_name")).sendKeys(nome);
			navegador.findElement(By.id("user_email")).sendKeys(email);
			navegador.findElement(By.id("user_password")).sendKeys(senha);
			navegador.findElement(By.id("user_password_confirmation")).sendKeys(confirmarSenha);
			return new Usuario(navegador);
		}
		else {
			System.out.println("-------------------------informarDadosPessoais()--------------------------------");
			System.out.println("Usuário já cadastrado!");
			System.out.println("--------------------------------------------------------------------------------");
			return new Usuario(navegador);
		}
	}
	
	public Usuario clicarSignUp() {
		
		String mensagemDeErro = navegador.findElement(By.xpath("//input[@value='Sign up']")).getText();
		
		if(mensagemDeErro.isEmpty()) {
			System.out.println("----------------------------------clicarSignUp()--------------------------------");
			System.out.println("Elemento SignUp está vazio!");
			System.out.println("--------------------------------------------------------------------------------");
			return new Usuario(navegador);
		}
		else {
			navegador.findElement(By.xpath("//input[@value='Sign up']")).click();
			return new Usuario(navegador);
		}
	}
	
	public Usuario clicarSignOut() {
			
		String mensagemDeErro = navegador.findElement(By.xpath("//a[@data-method='delete']")).getText();
		
		if(mensagemDeErro.isEmpty()) {
			System.out.println("---------------------------------clicarSignOut()--------------------------------");
			System.out.println("Elemento SignOut está vazio!");
			System.out.println("--------------------------------------------------------------------------------");
			return new Usuario(navegador);
		}
		else {
			navegador.findElement(By.xpath("//a[@data-method='delete']")).click();
			return new Usuario(navegador);
		}
		
	}
}
