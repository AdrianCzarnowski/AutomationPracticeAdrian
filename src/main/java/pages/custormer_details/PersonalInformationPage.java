package pages.custormer_details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class PersonalInformationPage extends BasePage {
    private static Logger log = LoggerFactory.getLogger("PersonalInformationPage.class");


    public void personalInformationForm() {

        WebElement gender = driver.findElement(By.cssSelector("#id_gender1"));
        gender.click();

        WebElement firstName = driver.findElement(By.cssSelector("#customer_firstname"));
        firstName.sendKeys("Jacek");
        log.info("<<<<<name added properly");

        WebElement lastName = driver.findElement(By.cssSelector("#customer_lastname"));
        lastName.sendKeys("Góralski");
        log.info("<<<<<last name added properly");

        WebElement password = driver.findElement(By.cssSelector("#passwd"));
        password.sendKeys("Haslo12345@");
        log.info("<<<<<psword added properly");

        WebElement dayBirth = driver.findElement(By.cssSelector("#days > option:nth-child(5)"));
        dayBirth.click();

        WebElement monthBirth = driver.findElement(By.cssSelector("#months > option:nth-child(9)"));
        monthBirth.click();

        WebElement yearBirth = driver.findElement(By.cssSelector("#years > option:nth-child(23)"));
        yearBirth.click();
        log.info("<<<<<date of birth setup properly");

        WebElement address = driver.findElement(By.cssSelector("#address1"));
        address.sendKeys("Freedom 5/2");
        log.info("<<<<<address added properly");

        WebElement city = driver.findElement(By.cssSelector("#city"));
        city.sendKeys("Minnesota");
        log.info("<<<<<city added properly");

        WebElement state = driver.findElement(By.cssSelector("#id_state > option:nth-child(48)"));
        state.click();

        WebElement postCode = driver.findElement(By.cssSelector("#postcode"));
        postCode.sendKeys("00000");
        log.info("<<<<<post code added properly");

        WebElement mobilePhone = driver.findElement(By.cssSelector("#phone_mobile"));
        mobilePhone.sendKeys(random.nextInt() + "");
        log.info("<<<<<phone number added properly");

        WebElement registerButton = driver.findElement(By.cssSelector("#submitAccount > span"));
        registerButton.click();
        log.info("<<<<<account  created properly");
        log.info("♛♛♛♛♛♛♛♛♛♛♛♛");




    }
}
