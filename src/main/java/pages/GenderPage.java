package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class GenderPage {
    ElementHelper elementHelper;

    By kadınBTN = By.id("trendyol.com:id/buttonSelectGenderWoman");

    public GenderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }
    

    public void checkGenerPage() {
        elementHelper.checkElement(kadınBTN);
    }

    public void clickGender() {
        elementHelper.click(kadınBTN);
    }
}
