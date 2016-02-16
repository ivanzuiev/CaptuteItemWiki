package ua.zuiev.ivan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ivan on 08.02.2016.
 */
public class WikiRunner {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();

        MainPage mainPage=(new MainPage(driver)).open();

        mainPage.captureElementScreenshot();
        driver.quit();
    }
}
