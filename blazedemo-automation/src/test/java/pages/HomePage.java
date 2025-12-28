package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    By fromCity = By.name("fromPort");
    By toCity = By.name("toPort");
    By findFlightsBtn = By.xpath("//input[@value='Find Flights']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCities(String from, String to) {

        Select fromDropdown = new Select(driver.findElement(fromCity));
        fromDropdown.selectByVisibleText(from);

        Select toDropdown = new Select(driver.findElement(toCity));
        toDropdown.selectByVisibleText(to);

        driver.findElement(findFlightsBtn).click();
    }
}

