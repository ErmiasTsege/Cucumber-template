package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CanNavigateandSearchApaga {
	private WebDriver driver;
	private WebElement landingpage;
	// public LandingPage landingpage;
	String searchValue = "cats";
	public final static String URL = "https://www.google.com";

	@Given("that I have gone to the Google page")
	public void aUserNavigatesTolandingpage() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(URL);

	}

	@When("I add cats to the search box")

	public void aUserSearchesFor() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
				.sendKeys("cats");

	}

	@When("click the Search icon")

	public void clicksearchbutton() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).submit();
		Thread.sleep(5000);
	}

	@Then("cats should be mentioned in the results")
	public void pageTitleIs() {
		String displayedTitle = driver.getTitle();
		assertEquals("cats - Google Search", displayedTitle);
		System.out.println(displayedTitle);
		driver.close();

	}

}
