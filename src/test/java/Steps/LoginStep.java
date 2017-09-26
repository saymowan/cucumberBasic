package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserFormPage() throws Throwable {

        System.out.println("Loooool");
    }


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

    }


    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin(String username, String password) throws Throwable {

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {

    }


}
