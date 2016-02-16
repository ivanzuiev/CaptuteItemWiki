package ua.zuiev.ivan;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by Ivan on 16.02.2016.
 */
public class Utils {

    private Utils(){}

    public static void captureElementScreenshot(WebElement element, WebDriver driver) throws Exception{

        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        int ImageWidth = element.getSize().getWidth();
        int ImageHeight = element.getSize().getHeight();

        Point point = element.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();

        BufferedImage img = ImageIO.read(screen);

        BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth, ImageHeight);
        ImageIO.write(dest, "png", screen);
        FileUtils.copyFile(screen,new File("C:\\Selenium\\Screenshots\\cropedItem.jpeg"));
    }

}
