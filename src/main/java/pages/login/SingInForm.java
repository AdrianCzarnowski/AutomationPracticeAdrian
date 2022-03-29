package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SingInForm extends BasePage {
    private static Logger log = LoggerFactory.getLogger("SingIn.class");

    public void singIn () {

        WebElement emailField = driver.findElement(By.cssSelector("#email"));
        emailField.sendKeys("testerpolska1234567890@gmail.com");

        WebElement passwordField = driver.findElement(By.cssSelector("#passwd"));
        passwordField.sendKeys("Haslo12345%");

        WebElement singInButton = driver.findElement(By.cssSelector("#SubmitLogin"));
        singInButton.click();

    }

}
