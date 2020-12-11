package com.ups.pageActions;

import org.openqa.selenium.WebDriver;

import com.ups.pageElements.UpsShippingPageElements;

public class UpsShippingPageActions {
	WebDriver driver;
	UpsShippingPageElements shippingPage = null;

	public UpsShippingPageActions(WebDriver driver) {

		this.shippingPage = new UpsShippingPageElements(driver);
	}

	public void handlecookie() {
		shippingPage.cookieButton().click();
	}

	public void clickShippingBtn() {
		shippingPage.shippingButton().click();
		;
	}

	public void clickCreateShipping() {
		shippingPage.createShipment().click();
	}

	public void enterName() {
		shippingPage.name().sendKeys("Rony");
	}

	public void enterContact() {
		shippingPage.contactName().sendKeys("Baharuzzaman Rony");
	}

	public void enterAddress() {
		shippingPage.address().sendKeys("Bronx, NY");
	}

	public void enterEmail() {
		shippingPage.email().sendKeys("rony@icloud.com");
	}

	public void enterPhone() {
		shippingPage.phone().sendKeys("2125856969");
	}

	public void clickContinue() {
		shippingPage.continueButton().click();
	}

}
