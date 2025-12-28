package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchasePage {

    WebDriver driver;

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By creditCard = By.id("creditCardNumber");
    By purchaseBtn = By.xpath("//input[@value='Purchase Flight']");

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDetails(String uname, String addr, String cityName, String cardNo) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(name));

        driver.findElement(name).sendKeys(uname);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(creditCard).sendKeys(cardNo);
        driver.findElement(purchaseBtn).click();
    }
}

