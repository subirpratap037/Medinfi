package com.medinfi.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


/**
 * Created by SUBIR on 2/10/2017.
 */
public class HomePage
{
    public WebDriver driver;

    //initialisation
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    //Declaration
    @FindBy(id="city-locality1")
    private WebElement cityTextBox;

    @FindBy(id="ip1_text1")
    private WebElement doctorTextBox;

    @FindBy(xpath="//li[@class='docHosLi']")
    private WebElement container;


    //utilization
    public void setCity(String city){
        cityTextBox.sendKeys(city);
        List<WebElement> list1 = driver.findElements(By.xpath("//a[@class='cityLoc']"));
        for(WebElement a: list1){
            list1.get(0).click();
        }
    }
    public void setDoctor(String doctor){
        doctorTextBox.sendKeys(doctor);
        List<WebElement> list2 = driver.findElements(By.xpath("//li[@class='docHosLi']"));

        int count = 0;
        String[] exp = {"Dr Shaila Kumar, Dentist",
                        "Dr Shaila Shamanur Bhattacharya, Pediatrician",
                        "Dr Shailaja, Pediatrician",
                        "Dr Shailaja, Ayurveda Specialist",
                        "Dr Shailaja Sampath, General Physician",
                        "Dr Shailendra Kumar Saxena, Physiotherapist",
                        "Dr Munavvar Sultana Shaikh, Homoeopath"};

        System.out.println("here is the list of doctors shai keyword n their name or specialization");
        for(WebElement b: list2){
            for (int i = 0; i < exp.length; i++) {
                if (b.getText().equals(exp[i])) {
                    System.out.println(b.getText());
                    count++;
                }
            }
        }
        if (count == exp.length) {
            System.out.println("matched - expected count is equals to actual count having doctors with shai keyword.");
            System.out.println("so, its validating that the expected result is equals to actual result");
        } else {
            System.out.println("Don't match.");
        }

    }

    }




