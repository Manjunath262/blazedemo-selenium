package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservePage {

    WebDriver driver;

    By chooseFlightBtn = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public ReservePage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseFlight() {
        driver.findElement(chooseFlightBtn).click();
    }
}

