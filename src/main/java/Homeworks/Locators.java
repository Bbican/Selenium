package Homeworks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.utilities.TestBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Locators extends TestBase {

    @Test
    public void Test(){

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        List<WebElement> allElements = driver.findElements(By.className("inventory_item_price"));
        int totalNumberOfElements = allElements.size();

        LinkedList<Double> allPrices = new LinkedList<>();

        int counter = 1;
        while(counter<=totalNumberOfElements) {
            String price = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])" + "[" + counter +"]")).getText().substring(1);
            allPrices.add(Double.parseDouble(price));
            counter++;
        }

        System.out.println("Unsorted: " + allPrices);
        Collections.sort(allPrices);
        System.out.println("Sorted: " + allPrices);

        Assert.assertTrue("Minimum price is NOT greater than $5", allPrices.getFirst()>5);
        Assert.assertTrue("Maximum price is NOT less than $50", allPrices.getLast()<50);


    }
}