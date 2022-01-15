package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");

        //Create firefox driver
        WebDriver driver = new FirefoxDriver();
        // going to google.com
        driver.get("https://www.google.com");
        //maximize
        driver.manage().window().maximize();
        // close
        driver.close();
    }

}
