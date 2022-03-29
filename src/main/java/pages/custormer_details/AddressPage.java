package pages.custormer_details;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class AddressPage extends BasePage {

    public void addressPage () {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 400);");
        WebElement addressButton = driver.findElement(By.cssSelector("p > button > span"));
        addressButton.click();
    }
}
