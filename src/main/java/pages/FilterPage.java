package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FilterPage {
    ElementHelper elementHelper;

    By filtreleme = By.id("trendyol.com:id/textLeftUp");
    By kargoCheckBox = By.id("trendyol.com:id/checkBoxSpecialFilter");
    By kargoBedava =  AppiumBy.androidUIAutomator("new UiSelector().text(\"Kargo Bedava\")");
    By urunListele = By.id("trendyol.com:id/btnApplyFilter");

    public FilterPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    public void checkOnFilterPage() throws InterruptedException {
        elementHelper.checkElement(filtreleme);
        Thread.sleep(7000);
    }

    public void clickKargo(String text) {
        elementHelper.scrollDown();
        elementHelper.clickElementWithText(kargoBedava,text);
        elementHelper.click(kargoCheckBox);
    }

    public void clickUrunListele() {
        elementHelper.click(urunListele);
    }
}
