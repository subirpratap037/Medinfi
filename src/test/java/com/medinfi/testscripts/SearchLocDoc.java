package com.medinfi.testscripts;

import com.medinfi.pageclass.HomePage;
import org.testng.annotations.Test;

/**
 * Created by SUBIR on 2/10/2017.
 */
public class SearchLocDoc extends BaseClass
{
    @Test
    public void enterCityDoctor(){
        HomePage home=new HomePage(driver);
        home.setCity("Aecs");
        home.setDoctor("shai");
    }
}
