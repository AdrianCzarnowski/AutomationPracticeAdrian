import org.junit.jupiter.api.Test;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainTest extends BasePage {

    @Test
    public void Test() throws IOException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new HomePage()
                .homePageTest();
        new SkirtPage()
                .skirt();
        new OrderChart()
                .orderChart();
        new BasketPage()
                .basketPage();
        new SummaryPage()
                .summaryPage();
        new SignIn()
                .singInPage();
    }
}
