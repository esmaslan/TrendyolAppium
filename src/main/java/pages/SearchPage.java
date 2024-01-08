package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SearchPage {
    ElementHelper elementHelper;

    By searchArea = By.id("trendyol.com:id/edittext_search_view");

    public SearchPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkOnSearchPage() {
        elementHelper.checkElement(searchArea);
    }

    public void sendKeysSearchArea(String text) {
        elementHelper.sendKeys(searchArea, text);
        elementHelper.pressSearch();
    }
}
