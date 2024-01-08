package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.GenderPage;
import utils.DriverManager;

public class GenderPageSteps {
    GenderPage genderPage = new GenderPage(DriverManager.getDriver());



    @Given("user should see the Gender Page")
    public void userShouldSeeTheGenderPage() {
        genderPage.checkGenerPage();
    }


    @When("taps Gender {string} on Gender Page")
    public void tapsGenderOnGenderPage(String gender) {
        genderPage.clickGender();
    }
}
