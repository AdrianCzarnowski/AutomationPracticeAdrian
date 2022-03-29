import org.junit.jupiter.api.Test;
import pages.*;
import pages.custormerDetails.AddressPage;
import pages.custormerDetails.PersonalInformationPage;
import pages.deliveryAndPayment.PaymentConfirmPage;
import pages.deliveryAndPayment.PaymentMethodPage;
import pages.deliveryAndPayment.ShippingPage;
import pages.custormerDetails.SignIn;
import pages.order.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainTest extends BasePage {

    @Test
    public void Test() throws IOException {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
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
                .userRegister();
        new PersonalInformationPage()
                .personalInformationForm();
        new AddressPage()
                .addressPage();
        new ShippingPage()
                .shippingPage();
        new PaymentMethodPage()
                .paymentPage();
        new PaymentConfirmPage()
                .paymentConfirm();
    }
}
