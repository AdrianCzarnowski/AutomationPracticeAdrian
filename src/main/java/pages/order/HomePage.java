package pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("HomePage.class");

   public void homePageTest() {;
        driver.get(URL);
        WebElement element = driver.findElement(By.cssSelector(".search_query"));
        element.click();
        element.sendKeys("t-shirt");
        WebElement element1 =  driver.findElement(By.cssSelector("#searchbox .btn"));
        element1.click();
       log.info("<<<<<t-shirt found properly");
    }

}
