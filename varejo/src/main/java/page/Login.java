package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import setup.Base;

public class Login extends Base{

	public Login(WebDriver navegador) {
		
		super(navegador);
		
	}
	
	public Login informarEmail(String email) {
		
		String campoEmail = "//input[@id='i0116']";
		String digitarEmail = email;
		String botaoProximo = "//input[@id='idSIButton9";
		
		navegador.findElement(By.xpath(campoEmail)).sendKeys(digitarEmail);
		navegador.findElement(By.xpath(botaoProximo)).click();
		return this;
		
	}
	
	public CaixaDeEntrada informarSenha(String senha) {
	
		String campoSenha = "i0118";
		String digitarSenha = senha;
		String botaoLogin = "idSIButton9";
	
		navegador.findElement(By.id(campoSenha)).sendKeys(digitarSenha);
		navegador.findElement(By.id(botaoLogin)).click();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new CaixaDeEntrada(navegador);
		
	}

}
