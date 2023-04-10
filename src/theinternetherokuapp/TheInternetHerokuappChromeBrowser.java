package theinternetherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheInternetHerokuappChromeBrowser {
    //declaring Main method
    public static void main(String[] args) {
     //Declaring String Variable
     String aUrl = "http://the-internet.herokuapp.com/login";
     //Launching Chrome browers with Instance of the class
        WebDriver driver = new ChromeDriver();
        // Url opening with mehtod
        driver.get(aUrl);
        //When browser open ensure it fits the Screen
        driver.manage().window().maximize();
        //Get Title of page
        String title = driver.getTitle();
        //Print Title
        System.out.println(title);
        //Calling rint current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        //Calling Print page source
        System.out.println("Page Source:" + driver.getPageSource());
        //Username clicking in the field and inputting email in the field
        driver.findElement(By.name("username")).sendKeys("Abc@Gmail.com");
        //Username clicking in the field and inputting email in the field
        driver.findElement(By.name("password")).sendKeys("A1B2c3");
        //closing driver
        driver.close();

















    }
}
