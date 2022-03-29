package pages.deliveryAndPayment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class PaymentMethodPage extends BasePage {


    public void paymentPage() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 400);");

        WebElement paymentMethodBankWire = driver.findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a"));
        paymentMethodBankWire.click();
    }

}