package com.venture.success.utils;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Helper {

    @Autowired
    private WebDriver localChromeDriver;

    public  void launchGoogle(){
     localChromeDriver.get("https://www.google.com");
    }

    public void maximiseWindow(){
        localChromeDriver.manage().window().maximize();
    }

    public void closeWindow(){
        localChromeDriver.close();
    }
}
