package br.sp.edimilsonestevam.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.sp.edimilsonestevam.setup.Base;

public class Login extends Base{

	public Login(WebDriver navegador) {
		super(navegador);

	}

	public void AcessarLogin() {
		
		System.out.println("• Acessando Página de Login...");
		
		String xPathSignIn = "//a[@class='login']";
		
		navegador.findElement(By.xpath(xPathSignIn)).click();
		navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	
	public void FazerLogin(String email, String senha) {
		
		System.out.println("• Fazendo Login...");
		
		String idEmail = "email";
		String idSenha = "passwd";
		String xPathBotaoLogin = "//p[@class='submit']//span[1]";
		
		navegador.findElement(By.id(idEmail)).sendKeys(email);
		navegador.findElement(By.id(idSenha)).sendKeys(senha);
		navegador.findElement(By.xpath(xPathBotaoLogin)).click();
		
	}
	
	public void RecuperarSenha(String email) {
		
		System.out.println("• Recuperando Senha...");
		
		String xPathEsqueceuSenha = "//a[contains(text(),'Forgot your password?')]";
		String idEmail = "email";
		String xPathBotaoRecuperarSenha = "//span[contains(text(),'Retrieve Password')]";
		String xPathBotaoVoltar = "//span[contains(text(),'Back to Login')]";
		
		navegador.findElement(By.xpath(xPathEsqueceuSenha)).click();
		navegador.findElement(By.id(idEmail)).sendKeys(email);
		navegador.findElement(By.xpath(xPathBotaoRecuperarSenha)).click();
		navegador.findElement(By.xpath(xPathBotaoVoltar)).click();
		
	}
	
}
