package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import utils.DriverManager;

public class ProductPageStep {
    ProductPage productPage = new ProductPage(DriverManager.getDriver());

    @Then("should see the Product Page")
    public void shouldSeeTheProductPage() {
        productPage.checkOnProductPage();
    }

    @When("save Product Name on Product Page")
    public void saveProductNameOnProductPage() {
        productPage.getProductName();
    }

    @And("taps Add To Basket {string} on Product Page")
    public void tapsAddToBasketOnProductPage(String text) {
        productPage.clickBasket();
    }

    @And("taps Size {string} on Product Page")
    public void tapsSizeOnProductPage(String text) {
        productPage.clickSize(text);
    }
}
