package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class PrintViewCartPage extends PrintBasePage {
	public By FIRSTNAMEFIELD = By.xpath("//input[@id='billing_first_name']");
	public By LASTNAMEFIELD = By.id("billing_last_name");
	public By CLICKCOUNTRY = By.id("select2-billing_country-container");
	public By SEARCHFIELD = By.xpath("//input[@role='combobox']");
	public By ADDRESS = By.id("billing_address_1");
	public By ZIP = By.id("billing_postcode");
	public By PHONE = By.id("billing_phone");
	public By EMAIL = By.id("billing_email");
	public By TERMS = By.id("terms");
	public By CONFIRM = By.id("place_order");

	public void firstName(String fname) {

		sendKeys(FIRSTNAMEFIELD, fname);
	}

	public void lastName(String lname) {
		sendKeys(LASTNAMEFIELD, lname);
	}

	public void clickCountry() {
		clickOnElement(CLICKCOUNTRY);
	}

	public void searchField(String text, WebElement enter) {
		sendKeys(SEARCHFIELD, text);
	}

	public void address(String adrs) {
		sendKeys(ADDRESS, adrs);
	}

	public void zip(String Zp) {
		sendKeys(ZIP, Zp);
	}

	public void phone(String phn) {
		sendKeys(PHONE, phn);
	}

	public void email(String mail) {
		sendKeys(EMAIL, mail);
	}

//	public void term() {
//		clickOnElement(TERMS);
//	}
	public void term() {

		try {
			clickOnElement(TERMS);
		} catch (StaleElementReferenceException ehh) {
			By trem = By.id("terms");
			clickOnElement(trem);
		}
	}

	public void confirm() {
		clickOnElement(CONFIRM);
	}
}
