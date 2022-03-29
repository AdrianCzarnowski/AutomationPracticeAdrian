package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePageSingIn extends BasePage {
    private static Logger log = LoggerFactory.getLogger("SingIn.class");

    public void singInButton () {
        WebElement singInButton = driver.findElement(By.cssSelector(".header_user_info > a"));
        singInButton.click();
    }
}
