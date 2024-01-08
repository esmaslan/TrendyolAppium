package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasketPage;
import utils.DriverManager;

public class BasketPageStep {
    BasketPage basketPage = new BasketPage(DriverManager.getDriver());


    @Then("should see the {string} Basket Page")
    public void shouldSeeTheBasketPage(String text) {
        basketPage.checkOnBasketPage();

    }

    @And("should see Same Product Name {string} on Basket Page")
    public void shouldSeeSameProductNameOnBasketPage(String montana) {
        String currentBrandName=basketPage.checkSameProductName();
        Assert.assertTrue(currentBrandName.equals(montana));
    }

    @When("taps Delete Button on Basket Page")
    public void tapsDeleteButtonOnBasketPage() {
        basketPage.clickDelete();
    }

    @And("taps Delete Popup on Basket Page")
    public void tapsDeletePopupOnBasketPage() {
        basketPage.clickPopupDelete();
    }

    @Then("should see Empty Message {string} on Basket Page")
    public void shouldSeeEmptyMessageOnBasketPage(String text) {
        String currentText=basketPage.getText();
        Assert.assertTrue(currentText.equals(text));
    }
}
