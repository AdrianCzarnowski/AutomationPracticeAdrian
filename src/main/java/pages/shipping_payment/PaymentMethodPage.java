package pages.shipping_payment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class PaymentMethodPage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("PaymentMethodPage.class");


    public void paymentPage() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 400);");

        WebElement paymentMethodBankWire = driver.findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a"));
        paymentMethodBankWire.click();
    }

}