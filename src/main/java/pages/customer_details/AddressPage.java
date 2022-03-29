package pages.customer_details;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class AddressPage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("AddressPage.class");

    public void addressPage() {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 400);");
        WebElement addressButton = driver.findElement(By.cssSelector("p > button > span"));
        addressButton.click();
    }
}
