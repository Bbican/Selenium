package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {
    public static void main(String[] args) {

//        1.Create a new class: VerifyURLTest
//        2.Navigate to google homepage
//        3.Verify if google homepage url is “www.google.com”

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.google.com/");


        //getting the url of the page
        String actualURL = driver.getCurrentUrl();
        //expected URL
        String expectedURL = "www.google.com";
        //Verification
        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL : "+actualURL);
            System.out.println("EXPECTED : "+expectedURL);
        }
        driver.close();
        /*
        Test Case failed
        FAIL
        ACTUAL : https://www.google.com
        EXPECTED : www.google.com

        Then what do you do when your test case fails???
        1. Run script again to make sure
        2. Manual testing to make sure
        3. Now I know that expected and actual result is not the same
        4. Then we communicate with the BA(write acceptance criteria) or talk to devselopers,

        ~~~ Testers do not fix a code. We reports the bugs. Developers then fix.
        5. After verifying the there is a bug then what do you di?
         - Follow the compony procedures
         - If they are using JIRA then open a big ticket
        6. Ticket opend, bug is fixed, dev told ypou bug is fixed.
         - Retest to make sure
         - If all good then close the bug ticket

         */



    }


}
