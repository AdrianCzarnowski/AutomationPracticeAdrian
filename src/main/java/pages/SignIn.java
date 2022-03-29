package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SignIn extends BasePage {

    private static Logger log = LoggerFactory.getLogger("SummaryPage.class");


    public void userRegister() throws IOException {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 200);");
        WebElement createAccountEmailAddres = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        createAccountEmailAddres.click();
        createAccountEmailAddres.sendKeys("testerpolska1234567890@gmail.com");

        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "PNG", new File("C://Users/aczarnowski/pictures/Saved Pictures/"
                + dateFormat.format(date) + " automation.PNG"));
    }
}
