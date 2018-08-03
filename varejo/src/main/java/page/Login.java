package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	private WebDriver navegador;
	
	public Login(WebDriver navegador) {
		this.navegador = navegador;	
	}
	
	public Login clicarLinkSignIn() {
		
		String linkLogin = "//a[@class='linkButtonSigninHeader']";
		
		navegador.findElement(By.xpath(linkLogin)).click();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new Login (navegador);
		
	}
	
	public Login informarEmail(String email) {
		
		String campoEmail = "//input[@id='i0116']";
		String digitarEmail = email;
		String botaoProximo = "//input[@id='idSIButton9";
		
		navegador.findElement(By.xpath(campoEmail)).sendKeys(digitarEmail);
		navegador.findElement(By.xpath(botaoProximo)).click();
		return this;
		
	}
	
	
	public Login informarSenha(String senha) {
	
		String campoSenha = "i0118";
		String digitarSenha = senha;
		String botaoLogin = "idSIButton9";
	
		navegador.findElement(By.id(campoSenha)).sendKeys(digitarSenha);
		navegador.findElement(By.id(botaoLogin)).click();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new Login(navegador);
		
	}
	
}
