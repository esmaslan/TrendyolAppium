package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultPage {
    ElementHelper elementHelper;

    By order = By.id("trendyol.com:id/layout_search_order");
    By filter = By.id("trendyol.com:id/layout_search_filter");
    By secondProduct = AppiumBy.androidUIAutomator("new UiSelector().text(\"MONTANA Baskılı T-shirt\")");


    public ResultPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkOnResultPage() {
       elementHelper.checkElement(order);
    }

    public void clickFilterBtn() throws InterruptedException {
        elementHelper.click(filter);
        Thread.sleep(5000);
    }

    public void clickOrder() {
        elementHelper.click(order);
    }

    public void clickSecondProduct() {
        elementHelper.click(secondProduct);
    }
}
