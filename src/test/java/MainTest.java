import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.customer_details.AddressPage;
import pages.customer_details.PersonalInformationPage;
import pages.customer_details.SignIn;
import pages.order.*;
import pages.shipping_payment.PaymentConfirmPage;
import pages.shipping_payment.PaymentMethodPage;
import pages.shipping_payment.ShippingPage;

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
