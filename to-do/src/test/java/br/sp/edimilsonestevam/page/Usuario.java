package br.sp.edimilsonestevam.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class Usuario extends Base{
	
	public Usuario(WebDriver navegador) {
		super(navegador);
	}

	public Usuario ClicarRegister() {
		
		navegador.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		return new Usuario(navegador);
			
	}
	
	public Usuario InformarDadosPessoais(String nome, String email, String senha, String confirmarSenha) {
				
		navegador.findElement(By.id("user_name")).sendKeys(nome);
		navegador.findElement(By.id("user_email")).sendKeys(email);
		navegador.findElement(By.id("user_password")).sendKeys(senha);
		navegador.findElement(By.id("user_password_confirmation")).sendKeys(confirmarSenha);
		return new Usuario(navegador);

	}
	
	public Usuario ClicarSignUp() {

			navegador.findElement(By.xpath("//input[@value='Sign up']")).click();
			navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			return new Usuario(navegador);

	}
	
	public Usuario ClicarSignOut() {

			navegador.findElement(By.xpath("//a[@data-method='delete']")).click();
			return new Usuario(navegador);

	}
}
