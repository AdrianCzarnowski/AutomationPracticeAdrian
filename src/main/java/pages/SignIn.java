package pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SignIn extends BasePage{

    private static Logger log = LoggerFactory.getLogger("SummaryPage.class");

    public void singInPage() throws IOException {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(130)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "PNG", new File("C://Users/aczarnowski/pictures/Saved Pictures/"
                + dateFormat.format(date) + " automation.PNG"));

    }
}
