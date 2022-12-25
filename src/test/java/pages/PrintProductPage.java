package pages;

import org.openqa.selenium.By;

public class PrintProductPage extends PrintBasePage {
	public By CLICKBOOK = By.xpath("//h3[contains(text(),'বিচিত্রা শিশুদের গল্পের ঝুলি (গোলাপী বই)')]");
	public By ADDTOCART = By.xpath("//button[@name='add-to-cart']");
	public By VIEWCART = By.xpath("//div[@class='dropdown-toggle cart-head cart-head4']");
	public By CHECKOUT = By.xpath("//a[@class='button checkout wc-forward']");

	
	
	public void clikBook() {
		clickOnElement(CLICKBOOK);
	}
	public void addToCart() {
		clickOnElement(ADDTOCART);
	}
	public void viewCart() {
		hoverA(VIEWCART);
	}
	public void checkOut() {
		clickOnElement(CHECKOUT);
	}
}
