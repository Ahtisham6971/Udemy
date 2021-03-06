package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("Navigated to login url");
	}

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("validate the browser");
	}

	@When("^Browser is trigged$")
	public void browser_is_trigged() throws Throwable {
		System.out.println("Browser is trigged");
	}

	@Then("^check if Browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("Browser is started");
	}

	@When("^User login into with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {

		System.out.println("Validated home page");

	}

	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

	@When("^User sign up with following details$")
	public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));

	}

	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
		System.out.println(username);
		System.out.println(password);
	}

}
