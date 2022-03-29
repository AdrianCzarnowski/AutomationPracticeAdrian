package pages.shipping_payment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ShippingPage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("ShippingPage.class");

    public void shippingPage() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 400);");

        WebElement termsCondition = driver.findElement(By.cssSelector("#cgv"));
        termsCondition.click();

        WebElement shippingButton = driver.findElement(By.cssSelector("p > button > span"));
        shippingButton.click();
    }
}
