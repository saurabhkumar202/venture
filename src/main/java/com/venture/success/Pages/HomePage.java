package com.venture.success.Pages;

import com.venture.success.utils.PropertiesHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;


@Component
public class HomePage {

   /* @Value("${searchKeyword}")
    private String searchKeyword ;*/

   @Autowired
   private PropertiesHelper propertiesHelper;

    @Autowired
    private WebDriver localChromeDriver;

    @Autowired
    private GoogleSearchResultPage googleSearchResultPage;

    @Autowired
    private Properties properties;



    public String getGoogleTitle() {

        return localChromeDriver.getTitle();
    }

    public GoogleSearchResultPage performGoogleSearchForResults() {
        BufferedReader br, lr;
        try {
          //  br = new BufferedReader(new FileReader("src\\main\\java\\com\\venture\\success\\Resources\\application.properties"));
          //  lr = new BufferedReader(new FileReader("src\\main\\resources\\locator.properties"));
            //properties.load(br);
           // String key = properties.getProperty("searchKeyword");
          //  properties.load(lr);
            localChromeDriver.findElement(By.cssSelector(propertiesHelper.getSearchBox())).sendKeys(propertiesHelper.getKeyword());
           // br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception occured " + e.getMessage());
        }

        localChromeDriver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.tfB0Bf > center > input.gNO89b")).click();
        return googleSearchResultPage;
    }

}
