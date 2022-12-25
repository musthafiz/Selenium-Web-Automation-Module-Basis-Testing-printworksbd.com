package pages;

import org.openqa.selenium.By;

public class PrintHomePage extends PrintBasePage{
	public By HOMEPAGE = By.xpath("//div[@class='header-left']//img[1]");
	public By NAVBARHOLD = By.xpath("//li[@id='nav-menu-item-721']//a[contains(text(),'বাংলা')]");
	public By SUBBARCLIK = By.xpath("//li[@id='nav-menu-item-13852']//a[contains(text(),'ছোটদের বই')]");
	


	
	
	
	public void homePage() {
		clickOnElement(HOMEPAGE);
	}
	public void navBarHold() {
		hoverA(NAVBARHOLD);
	}
	public void subBarclik() {
		clickOnElement(SUBBARCLIK);
	}

}
