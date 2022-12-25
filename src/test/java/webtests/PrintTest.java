package webtests;
//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.PrintBasePage;
import pages.PrintHomePage;
import pages.PrintLoginPage;
import pages.PrintProductPage;
import pages.PrintViewCartPage;
import utilities.PrintDriverSetup;

public class PrintTest extends PrintDriverSetup {
	PrintLoginPage LogINPage = new PrintLoginPage();
	PrintHomePage HomePage = new PrintHomePage();
	PrintBasePage BasePage = new PrintBasePage();
	PrintProductPage ProductPage = new PrintProductPage();
	PrintViewCartPage ShopingCartPage = new PrintViewCartPage();

	@Test
	public void webTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		getDriver().get("https://www.printworksbd.com/");
		LogINPage.logIn();
//		LogINPage.userName();
//		LogINPage.password("Print1234");
		LogINPage.doLogin("musthafizchowdhury@gmail.com", "Print1234");
		LogINPage.getElement(LogINPage.SUBMIT).click();
		HomePage.homePage();
		HomePage.navBarHold();
		HomePage.subBarclik();
		ProductPage.clikBook();
		ProductPage.addToCart();
		ProductPage.viewCart();
		ProductPage.checkOut();
		Thread.sleep(5000);
		ShopingCartPage.getElement(ShopingCartPage.FIRSTNAMEFIELD).clear();
		ShopingCartPage.firstName("Kabila");
		ShopingCartPage.getElement(ShopingCartPage.LASTNAMEFIELD).clear();
		ShopingCartPage.lastName("Rokeya");
		ShopingCartPage.clickCountry();
		ShopingCartPage.searchField("Fiji", ShopingCartPage.getElement(ShopingCartPage.SEARCHFIELD));
		ShopingCartPage.getElement(ShopingCartPage.SEARCHFIELD).sendKeys(Keys.ENTER);
		ShopingCartPage.getElement(ShopingCartPage.ADDRESS).clear();
		ShopingCartPage.address("Akur Thakur Para, Simul toli road");
		ShopingCartPage.getElement(ShopingCartPage.ZIP).clear();
		ShopingCartPage.zip("8560");
		js.executeScript("window.scrollBy(0,500)");
		ShopingCartPage.getElement(ShopingCartPage.PHONE).clear();
		ShopingCartPage.phone("01558996332");
		ShopingCartPage.getElement(ShopingCartPage.EMAIL).clear();
		ShopingCartPage.email("kholachithi@howa.gom");
		ShopingCartPage.term();
//		ShopingCartPage.getElement(ShopingCartPage.TERMS).click();
		ShopingCartPage.getElement(ShopingCartPage.CONFIRM).click();
//		ShopingCartPage.confirm();
	}

}
