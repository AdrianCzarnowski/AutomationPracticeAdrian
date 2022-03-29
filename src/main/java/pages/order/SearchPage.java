package pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchPage extends BasketPage{

    private static Logger log = LoggerFactory.getLogger("SearchPage.class");

    public void itemSearch() {
        WebElement element = driver.findElement(By.cssSelector(".search_query"));
        element.click();
        element.sendKeys("t-shirt");
        WebElement element1 = driver.findElement(By.cssSelector("#searchbox .btn"));
        element1.click();
    }
}
