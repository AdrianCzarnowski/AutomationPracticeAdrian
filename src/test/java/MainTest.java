import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.customer_details.AddressPage;
import pages.customer_details.PersonalInformationPage;
import pages.customer_details.CreateAccount;
import pages.login.HomePageSingIn;
import pages.login.SingInForm;
import pages.order.*;
import pages.shipping_payment.PaymentConfirmPage;
import pages.shipping_payment.PaymentMethodPage;
import pages.shipping_payment.ShippingPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainTest extends BasePage {

    @Test
    @DisplayName("Buy Item")
    public void Test() throws IOException {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        new HomePage()
                .homePageTest();
        new SearchPage()
                .itemSearch();
        new ItemPage()
                .item();
        new OrderChart()
                .orderChart();
        new BasketPage()
                .basketPage();
        new OrderSummaryPage()
                .orderSummaryPage();
        new CreateAccount()
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

    @Test
    @DisplayName("Login")
    public void loginTest () {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        new HomePage()
                .homePageTest();
        new HomePageSingIn()
                .singInButton();
        new SingInForm()
                .singIn();

    }
}
