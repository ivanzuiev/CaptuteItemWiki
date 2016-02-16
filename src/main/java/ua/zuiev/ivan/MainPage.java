package ua.zuiev.ivan;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by Ivan on 08.02.2016.
 */
public class MainPage extends Page {

    public MainPage(WebDriver driver){
        super(driver);
    }

    private String url="https://en.wikipedia.org/wiki/Main_Page";

    @FindBy(xpath = ".//div[@id='mp-itn']/ul/li[3]")
    WebElement itemElement;

    public MainPage open(){
        _driver.get(url);
        return PageFactory.initElements(_driver,MainPage.class);
    }

    public void captureElementScreenshot() throws Exception {
    Utils.captureElementScreenshot(itemElement, _driver);
    }



}
