package Homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.utilities.TestBase;

public class IframeTest extends TestBase {
    @Test
    public void iframeTest() throws InterruptedException {



        driver.get("https://html.com/tags/iframe/");

        Actions action = new Actions(driver);

        action.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);

        action.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);

        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='lazy-loaded']"));

        driver.switchTo().frame(iframeElement);

        WebElement playButton = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));

        playButton.click();

        Thread.sleep(5000);

        driver.switchTo().parentFrame();

        iframeElement.click();



    }
}
