package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultibrowserTest
{
    public static void main(String[] args)
    {
        String B = "Chrome"; // "Edge"  // "Firefox"
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        if (B.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get(baseurl);//Launch the URL
            driver.manage().window().maximize();//Maximize window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//We give Implicit time to driver

            String title = driver.getTitle();//Get the title of the page
            System.out.println("Page title = " +title);
            System.out.println("Current URL = " +driver.getCurrentUrl());//Get Current URL

            String p = driver.getPageSource();//Get the page-source
            System.out.println("Page-Source=" +p);

            WebElement emailField = driver.findElement(By.id("Email"));//Find the email field element
            emailField.sendKeys("abc123@gmail.com");

            WebElement passwordField = driver.findElement(By.id("Password"));
            passwordField.sendKeys("abc123");

            //driver.close();//Close the browser
        }
        else if (B.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();

            driver.get(baseurl);//Launch the URL
            driver.manage().window().maximize();//Maximize window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//We give Implicit time to driver

            String title = driver.getTitle();//Get the title of the page
            System.out.println("Page title = " +title);
            System.out.println("Current URL = " +driver.getCurrentUrl());//Get Current URL

            String p = driver.getPageSource();//Get the page-source
            System.out.println("Page-Source=" +p);

            WebElement emailField = driver.findElement(By.id("Email"));//Find the email field element
            emailField.sendKeys("abc123@gmail.com");

            WebElement passwordField = driver.findElement(By.id("Password"));
            passwordField.sendKeys("abc123");

            driver.close();//Close the browser
        }
        else if (B.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

            driver.get(baseurl);//Launch the URL
            driver.manage().window().maximize();//Maximize window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//We give Implicit time to driver

            String title = driver.getTitle();//Get the title of the page
            System.out.println("Page title = " +title);
            System.out.println("Current URL = " +driver.getCurrentUrl());//Get Current URL

            String p = driver.getPageSource();//Get the page-source
            System.out.println("Page-Source=" +p);

            WebElement emailField = driver.findElement(By.id("Email"));//Find the email field element
            emailField.sendKeys("abc123@gmail.com");

            WebElement passwordField = driver.findElement(By.id("Password"));
            passwordField.sendKeys("abc123");

            driver.close();//Close the browser
        }
        else
        {
            System.out.println(" Driver does not match");
        }

    }
}
