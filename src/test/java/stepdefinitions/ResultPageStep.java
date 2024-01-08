package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ResultPage;
import utils.DriverManager;

public class ResultPageStep {

    ResultPage resultPage = new ResultPage(DriverManager.getDriver());

    @Then("should see the Result Page")
    public void shouldSeeTheResultPage() {
        resultPage.checkOnResultPage();
    }

    @When("taps Filter on Result Page")
    public void tapsFilterOnResultPage() throws InterruptedException {
        resultPage.clickFilterBtn();
    }

    @When("taps Order on Result Page")
    public void tapsOrderOnResultPage() {
        resultPage.clickOrder();
    }

    @When("taps second Product on Result Page")
    public void tapsSecondProductOnResultPage() {
        resultPage.clickSecondProduct();
    }
}
