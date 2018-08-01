package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import setup.Base;

public class Home extends Base{
	
	public Home(WebDriver navegador) {
		
		super(navegador);	
		
	}
	
	public Login clicarLinkSignIn() {
		
		String linkLogin = "//a[@class='linkButtonSigninHeader']";
		
		navegador.findElement(By.xpath(linkLogin)).click();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new Login (navegador);
		
	}
	
}
