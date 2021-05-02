
package stepDifination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDifination {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() {
		System.out.println("Navigated to Landing page by providing url ");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() {
		System.out.println("Username and password are provided");
	}

	@Then("^Homepage is populated$")
	public void homepage_is_populated() {
		System.out.println("Validated HomePage");
	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() {
		System.out.println("Validated cards in the HomePage");

	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_and_password(String arg1, String arg2) {
		System.out.println("Username is: " + arg1 + " and  Password is: " + arg2);

	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) {
		System.out.println("Cards Displayed: " + arg1);
	}
}
