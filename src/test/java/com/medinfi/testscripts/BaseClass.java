package com.medinfi.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by SUBIR on 2/10/2017.
 */
public class BaseClass
{
    public WebDriver driver;

    @BeforeClass
    public void launchApplication(){
        System.setProperty("webdriver.gecko.driver", "E:\\subir.pratap_backup\\Extract Files\\geckodriver.exe");
        driver=new FirefoxDriver();
        Reporter.log("Browser opened");
        driver.get("http://www.medinfi.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.print("Testing the git commit001");
    }
//    @AfterClass
//    public void quit(){
//        driver.quit();
//    }
}
