package pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class TShirtPage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("SkirtPage.class");

    public void tshirt() {
        WebElement element = driver.findElement(By.cssSelector(".left-block > div > a.product_img_link > img"));
        element.click();
        log.info("<<<<<t-shirt found properly");

    }

}