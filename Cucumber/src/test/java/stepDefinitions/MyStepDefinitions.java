package stepDefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber_Practice.Cucumber.Base;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public static WebDriver driver;
	HomePage h;
	CheckoutPage cp;

	@Given("^User is on GreenKart Landing page$")
	public void user_is_on_greenkart_landing_page() throws Throwable {
		driver = Base.getDriver();

	}

	@When("^User Searched for (.+) vegetable$")
	public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
		h = new HomePage(driver);
		h.getSearch().sendKeys(strArg1);

		Thread.sleep(2000);
	}

	@When("^User Searched for (.+) vegetables$")
	public void user_searched_for_vegetables(String name) throws Throwable {
		throw new PendingException();
	}

	@Then("^verify selected (.+) are displayed in checkout page$")
	public void verify_selected_are_displayed_in_checkout_page(String name) throws Throwable {
		cp = new CheckoutPage(driver);
		Assert.assertTrue(cp.getProductName().getText().contains(name));
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void something_results_are_displayed(String strArg1) throws Throwable {
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
	}

	@And("^Added items to cart$")
	public void added_items_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	}

	@And("^User proceeded to checkout page$")
	public void user_proceeded_to_checkout_page() throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	}

}
