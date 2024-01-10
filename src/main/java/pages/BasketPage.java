package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BasketPage {
    ElementHelper elementHelper;

    By sepetim = By.id("trendyol.com:id/textLeftUp");
    By delete = By.id("trendyol.com:id/imageViewDeleteProduct");
    By popupDelete = By.id("trendyol.com:id/textViewBasketRemoveAction");
    By basketText = By.id("trendyol.com:id/textViewMessage");
    By montanaText = AppiumBy.androidUIAutomator("new UiSelector().text(\"MONTANA Baskılı T-shirt\")");

    public BasketPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }




    public void checkOnBasketPage() {
        elementHelper.checkElement(sepetim);
        //String locator = "//android.widget.TextView[@text=\"" + item + "\"]/../android.widget.CheckBox";-->/.. bir üst elemente çıkıyor
    }

    public String checkSameProductName() {
        return elementHelper.getText(montanaText);
    }

    public void clickDelete() {
        elementHelper.click(delete);
    }

    public void clickPopupDelete() {
        elementHelper.click(popupDelete);
    }

    public String getText() {
        return elementHelper.getText(basketText);
    }
}
