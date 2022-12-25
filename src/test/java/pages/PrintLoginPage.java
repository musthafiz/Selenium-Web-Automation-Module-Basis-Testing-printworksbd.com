package pages;

import org.openqa.selenium.By;

public class PrintLoginPage extends PrintBasePage {
	public By LOGIN = By.xpath("//ul[@id='menu-top-navigation']//a[normalize-space()='Log In']");
	public By USERNAME = By.id("username");
	public By PASSWORD = By.id("password");
	public By SUBMIT = By.xpath("//input[@name='login']");

	
	public void logIn() {
		clickOnElement(LOGIN);
	}
//	public void userName() {
//		sendKeys(USERNAME,"musthafizchowdhury@gmail.com" );
//	}
	public void password(String password) {
		sendKeys(PASSWORD,password );
	}
	public void doLogin(String name, String pass) {
		sendKeys(USERNAME, name);
		sendKeys(PASSWORD, pass);
	}
//	public void submit() {
//		clickOnElement(SUBMIT);
//	}

}
