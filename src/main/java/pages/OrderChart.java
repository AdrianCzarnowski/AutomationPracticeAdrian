package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderChart extends BasePage {

    private static Logger log = LoggerFactory.getLogger("OrderChart2.class");

    public void orderChart() {
        ((JavascriptExecutor)driver).executeScript("scroll(0,5500)");
        WebElement element = driver.findElement(By.cssSelector("#add_to_cart > button > span"));
        element.click();
    }
}