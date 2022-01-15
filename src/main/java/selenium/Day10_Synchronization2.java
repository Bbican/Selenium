package selenium;


//        And click on Disable button
//        And verify the message is equal to “It's disabled!”
//        And verify the textbox is disabled (I cannot type in the box)
//        NOTE: .isEnabled(); is used to check if an element is enabled or not

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//        Create a class:Synchronization2. Create a method: isEnabled
public class Day10_Synchronization2 {

    //        Go to https://the-internet.herokuapp.com/dynamic_controls
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        //        Go to https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }
    @Test
    public void synchronization2() throws InterruptedException {
        //        Click enable Button


        //        And verify the message is equal to “It's enabled!”




        //        And verify the textbox is enabled (I can type in the box)



    }
}
