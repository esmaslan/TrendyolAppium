package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FilterPage;
import utils.DriverManager;

public class FilterPageStep {

    FilterPage filterPage = new FilterPage(DriverManager.getDriver());

    @Then("should see the Filter Page")
    public void shouldSeeTheFilterPage() throws InterruptedException {

        filterPage.checkOnFilterPage();
    }

    @When("taps Filter {string} on Filter Page")
    public void tapsFilterOnFilterPage(String filterText) {
        filterPage.clickKargo(filterText);
    }

    @When("taps List Products {string} on Filter Page")
    public void tapsListProductsOnFilterPage(String ürünListele) {
        filterPage.clickUrunListele();
    }
}
