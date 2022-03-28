package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SummaryPage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("SummaryPage.class");

    public void summaryPage () {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        WebElement element = driver.findElement(By.cssSelector("a.button.btn.btn-default.standard-checkout"));
        element.click();
    }

}
