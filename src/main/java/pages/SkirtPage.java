package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkirtPage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("SkirtPage.class");

    public void skirt() {
        WebElement element = driver.findElement(By.cssSelector(".left-block > div > a.product_img_link > img"));
        element.click();

    }

}
