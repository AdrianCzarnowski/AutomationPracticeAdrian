package pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class BasketPage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("SummaryPage.class");

    public void basketPage() {

        WebElement element = driver.findElement(By.cssSelector(".button-container > a > span"));
        element.click();

    }

}
