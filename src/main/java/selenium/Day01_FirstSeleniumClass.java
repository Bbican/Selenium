package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {
    public static void main(String[] args) {
//       System.setProperty("DRIVER TYPE", "DRIVER PATH");
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
//          Creating the WebDriver object
//          Polymorphism
        WebDriver driver=new ChromeDriver();
//      Now that I create driver object, I can use that to interact with the web based application
        driver.get("http://amazon.com");
    }
}
