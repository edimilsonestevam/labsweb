package br.sp.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;


public class Login extends Base{

	public Login(WebDriver navegador) {
		super(navegador);
		
	}
	
	public Login realizarLogin(String apelido, String senha) {
		
		navegador.findElement(By.id("user_email")).sendKeys(apelido);
		navegador.findElement(By.id("user_password")).sendKeys(senha);
		navegador.findElement(By.id("id_entrar_login")).click();
		return new Login(navegador);
	}

}
