package pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {

    private static Logger log = LoggerFactory.getLogger("HomePage.class");

    public void homePageTest() {
        driver.get(URL);
//        return new SearchPage();
    }

}
