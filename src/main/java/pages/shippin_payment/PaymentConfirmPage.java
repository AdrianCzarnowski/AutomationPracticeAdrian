package pages.shippin_payment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class PaymentConfirmPage extends BasePage {

    public void paymentConfirm() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 400);");
        WebElement confirmButton = driver.findElement(By.cssSelector("#cart_navigation > button > span"));
        confirmButton.click();
    }
}
