package com.qa.examples.cucumber_base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public final static String URL = "https://www.google.com";

	private WebDriver driver;
	public WebElement webelements;

	// 1
//	public LandingPage(WebDriver driver) {
//         
//		PageFactory.initElements(driver, this);
//	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void goToHomePage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}

	@FindBy(css = "input[name=q]")
	private WebElement searchInput;

	public WebDriver getDriver() {
		return driver;
	}

	public void searchInGoogle(String searchitem) {
		searchInput.sendKeys(searchitem);
		
	}
	public void clicksearhcbutton() {
		searchInput.sendKeys(Keys.ENTER);
		
	}
	
	
	public String getUrl() {
		return URL;
	}
	
	public void tearDown() {
		driver.quit();

	}
}
