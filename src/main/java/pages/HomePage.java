package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {
    ElementHelper elementHelper;

    By closeBtn = By.id("trendyol.com:id/imageViewTooltipClose");
    By anasayfa = By.id("trendyol.com:id/tab_home");
    By searchBtn = By.id("trendyol.com:id/search_view_inner_container");

    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void closePopup() {
        elementHelper.click(closeBtn);
    }

    public void checkHomePage() {
        elementHelper.checkElement(anasayfa);
    }

    public void clickSearchArea() {
        elementHelper.click(searchBtn);
    }
}
