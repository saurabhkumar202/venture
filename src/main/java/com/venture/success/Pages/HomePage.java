package com.venture.success.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;


@Component
public class HomePage {

    @Autowired
    private WebDriver localChromeDriver;

    @Autowired
    private GoogleSearchResultPage googleSearchResultPage;

    public String getGoogleTitle() {

        return localChromeDriver.getTitle();
    }

    public GoogleSearchResultPage performGoogleSearchForResults() {
        Properties pr = new Properties();
        BufferedReader br, lr;
        try {
            br = new BufferedReader(new FileReader("src\\main\\java\\com\\venture\\success\\Resources\\application.properties"));
            lr = new BufferedReader(new FileReader("src\\main\\java\\com\\venture\\success\\Resources\\locator.properties"));
            pr.load(br);
            String key = pr.getProperty("searchKeyword");
            pr.load(lr);
            localChromeDriver.findElement(By.cssSelector(pr.getProperty("searchBox"))).sendKeys(key);
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception occured " + e.getMessage());
        }

        localChromeDriver.findElement(By.cssSelector("ul > li:nth-child(1)")).click();
        return googleSearchResultPage;
    }

}
