package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;
import utils.DriverManager;

public class SearchPageStep {

    SearchPage searchPage = new SearchPage(DriverManager.getDriver());

    @Then("should see the Search Page")
    public void shouldSeeTheSearchPage() {
        searchPage.checkOnSearchPage();
    }

    @When("sendkeys Search Area {string} on Search Page")
    public void sendkeysSearchAreaOnSearchPage(String text) {
        searchPage.sendKeysSearchArea(text);
    }
}
