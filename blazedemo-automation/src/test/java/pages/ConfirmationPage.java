package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    WebDriver driver;

    By confirmationHeading = By.tagName("h1");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isBookingConfirmed() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationHeading));

        String text = driver.findElement(confirmationHeading).getText();
        return text.contains("Thank you");
    }
}
