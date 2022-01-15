package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day06_NewWindowSel4 {

    @Test
    public void newWindowsTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver"); //MAC
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //   Open google in window 1
        driver.get("https://www.google.com");
        String googleHandle = driver.getWindowHandle();

        // Open amazon in window 2
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com");
        String amazonHandle = driver.getWindowHandle();

        // Open linkedin in window 3
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinHandle = driver.getWindowHandle();

        // SWITCH BAKC TO google wondow
        Thread.sleep(3000);
        driver.switchTo().window(googleHandle);
        System.out.println("GOOGLE URL =>" + driver.getCurrentUrl());

        // Switch bak to amazon
        Thread.sleep(3000);
        driver.switchTo().window(amazonHandle);
        System.out.println("AMAZON URL =>" + driver.getCurrentUrl());

        // Switch bak to linkedin
        Thread.sleep(3000);
        driver.switchTo().window(linkedinHandle);
        System.out.println("LINKEDIN URL =>" + driver.getCurrentUrl());
    }



}
