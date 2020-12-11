package com.ups.pageActions;

import org.openqa.selenium.WebDriver;

import com.ups.pageElements.UpsTrackingPageElements;

public class UpsTrackingPageActions {
	WebDriver driver;
	UpsTrackingPageElements trackingPage = null;

	public UpsTrackingPageActions(WebDriver driver) {
		this.trackingPage=new UpsTrackingPageElements(driver);
	}

	public void clickTrackingBtn() {
		trackingPage.tracking().click();
	}

	public void clicktrackPackageBtn() {
		trackingPage.trackPackage().click();
	}
	public void entertrackerbox() {
		trackingPage.trackBox().sendKeys("698521479");
	}

	public void clicktrackbtn() {
		trackingPage.trackButton().click();
	}

	public String gettrackErrorMsg() {
		String trackingerrormsg = trackingPage.tracErrorMsg().getText();
		return trackingerrormsg;
	}
	}



