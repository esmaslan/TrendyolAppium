package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FilterPage;
import pages.OrderPage;
import utils.DriverManager;

public class OrderPageStep {

    OrderPage orderPage = new OrderPage(DriverManager.getDriver());

    @Then("should see the Order Page")
    public void shouldSeeTheOrderPage() {
        orderPage.checkOnOrderPage();
    }

    @When("taps Option {string} on Order Page")
    public void tapsOptionOnOrderPage(String enCokDeger) {
        orderPage.clickEnCokDeg(enCokDeger);
    }
}
