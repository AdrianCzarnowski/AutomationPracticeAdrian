import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.custormer_details.AddressPage;
import pages.custormer_details.PersonalInformationPage;
import pages.custormer_details.SignIn;
import pages.order.*;
import pages.shippin_payment.PaymentConfirmPage;
import pages.shippin_payment.PaymentMethodPage;
import pages.shippin_payment.ShippingPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainTest extends BasePage {

    @Test
    public void Test() throws IOException {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        new HomePage()
                .homePageTest();
        new ItemPage()
                .item();
        new OrderChart()
                .orderChart();
        new BasketPage()
                .basketPage();
        new OrderSummaryPage()
                .orderSummaryPage();
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
