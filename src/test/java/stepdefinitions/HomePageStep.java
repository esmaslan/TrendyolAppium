package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageStep {
    HomePage homePage = new HomePage(DriverManager.getDriver());


    @Then("should Popup Close Button on Home Page")
    public void shouldPopupCloseButtonOnHomePage() {
        homePage.closePopup();
    }

    @Then("should see the Home Page")
    public void shouldSeeTheHomePage() {
        homePage.checkHomePage();
    }

    @When("taps Search Area on Home Page")
    public void tapsSearchAreaOnHomePage() {
        homePage.clickSearchArea();
    }
}
