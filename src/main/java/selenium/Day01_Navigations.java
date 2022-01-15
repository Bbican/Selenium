package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Navigations {
    public static void main(String[] args) throws InterruptedException {
        // Step 1 : set the path and driver name
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");

        // Step 2 : Create WebDriver object
        WebDriver driver = new ChromeDriver();

        //        Maximize the window
        driver.manage().window().maximize();

        // Step 3 : Now I have driver, I can use driver in automation
        // Go to Google
        driver.get("http://google.com");

        // putting 3 secons wait
        Thread.sleep(3000); // 3 seconds hard wait


//        On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://amazon.com/");
        Thread.sleep(3000);

//        Navigate back to google
        driver.navigate().back();
        Thread.sleep(3000);

//        Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(3000);

//        Refresh the page
        driver.navigate().refresh();
        Thread.sleep(3000);

//        Close/Quit the browser
//        To close a driver, we can use close(); or quit();
        //       driver.close();
        driver.quit();

        /*
            What is the difference between get() and navigate.to????
            1. get() easier to use, and use more than navigate
            2. get() a little faster
            3. get() takes only String, but navigate.to takes String or URL as parameter
            4. navigate has more options : back, forward, refresh

            What is the difference between close and quit?
            - close() -> closes only current working browser
            - quit() -> closes all browsers.

            What is the Thread.sleep()?
            - It is used to put some wait.
            - Thread.sleep(5000); put 5 second ON THIS STEP
            - Thread.sleep is a JAVA wait. It is not a selenium wait.
            - Because this is HARD wait.
            -It means, this will put extra wait EVEN IF WE DON'T NEED


         */






    }
}


