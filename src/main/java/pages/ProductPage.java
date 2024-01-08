package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductPage {
    ElementHelper elementHelper;

    By sepeteEkle =AppiumBy.androidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By sizeBtn = AppiumBy.androidUIAutomator("new UiSelector().text(\"M\")");

    public ProductPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    public void checkOnProductPage() {
        elementHelper.checkElement(sepeteEkle);
    }

    public void getProductName() {

    }

    public void clickBasket() {
        elementHelper.click(sepeteEkle);
    }

    public void clickSize(String text) {
        elementHelper.clickElementWithText(sizeBtn,text);
    }
}
