package theinternetherokuapp;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TheInternetHerokuappMultiBrowser {
    //declaing global variable
    static String browser ="Edge";
    static WebDriver driver;
    static  String burl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        //If Else method
        if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver= new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }else{
            System.out.println("Incorrect Browser name");
        }
        //Wen browser opens to fit Screen
        driver.manage().window().maximize();
        //Open URL using get method
        driver.get(burl);
        //Print title of Page
        System.out.println(driver.getTitle());
        //Print current URL
        System.out.println(driver.getCurrentUrl());
        //Print page source
        System.out.println(driver.getPageSource());
        //Locating Username field and inputting email address
        driver.findElement(By.name("username")).sendKeys("Abc@Gmail.com");
        //Locating Password field and inputting email address
        driver.findElement(By.name("password")).sendKeys("A1B1c3");
        //closing driver
        //driver.close();
    }

}
