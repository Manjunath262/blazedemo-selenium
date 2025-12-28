package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ConfirmationPage;
import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;
import utils.BaseTest;

public class FlightBookingTest extends BaseTest {

    @Test
    public void bookFlightSuccessfully() {

        HomePage home = new HomePage(driver);
        home.selectCities("Boston", "New York");

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterDetails("Manjunath", "Bangalore", "Bangalore", "123456789");

        ConfirmationPage confirm = new ConfirmationPage(driver);
        Assert.assertTrue(confirm.isBookingConfirmed(),
                "Booking confirmation failed");
    }
}

