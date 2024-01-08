package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class OrderPage {
    ElementHelper elementHelper;

    By siralama = By.className("android.widget.TextView");
    By orders = By.id("trendyol.com:id/radioButtonSortingTypeItem");

    public OrderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkOnOrderPage() {
        elementHelper.checkElement(siralama);
    }

    public void clickEnCokDeg(String enCokDeg) {

        elementHelper.clickElementWithText(orders,enCokDeg);
    }
}
