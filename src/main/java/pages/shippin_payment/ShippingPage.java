package pages.shippin_payment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ShippingPage extends BasePage {

    public void shippingPage() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 400);");

        WebElement termsCondition = driver.findElement(By.cssSelector("#cgv"));
        termsCondition.click();

        WebElement shippingButton = driver.findElement(By.cssSelector("p > button > span"));
        shippingButton.click();
    }
}
