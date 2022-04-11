package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
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

        WebElement passwordField = driver.findElement(By.id("Password"));//Find the password field element
        passwordField.sendKeys("abc123");

        driver.close();//Close the browser
    }
}
