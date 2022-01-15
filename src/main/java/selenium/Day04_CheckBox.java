package selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_CheckBox {
    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver"); //MAC
//        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");// WINDOWS
        driver = new ChromeDriver();

        // ADDING IMPLICITLY WAIT
        // SELENIUM 3
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // SELENIUM 4
        // Implicitly wait is used to put DYNAMIC WAIT for the driver
        // Dynamic wait means driver will only wait WHEN  NEEDED.
        // When we use implicit wait in before method, then we do not to use implicit wait again
        // Thread.sleep(10); -> WAIT 10 seconds NO MATTER WHAT
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); -> WAIT UP TO 10 second
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @Test
    public void checkBox() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        // location the first checkbox
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        // Verify that checkbox1 is NOT CHECKED
        Assert.assertFalse(checkBox1.isSelected());

        // locating the checkbox2
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        // Verify that checkbox1 is  SELECTED
        Assert.assertTrue(checkBox2.isSelected());

        //    Thread.sleep(5000);

        // How to check or Uncheck a check box
        checkBox1.click(); // check

        checkBox2.click(); // unchecked

        // How to check only unchecked boxes?
        // If checkbox is Not check then click
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }
        Assert.assertTrue(checkBox1.isSelected());
        Assert.assertTrue(checkBox2.isSelected());
    }
    @After
    public void tearDown(){

        //    driver.quit();
    }

}
