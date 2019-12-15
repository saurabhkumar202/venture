package com.venture.success.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoogleSearchResultPage {

    @Autowired
    private WebDriver localChromeDriver;

    @Autowired
    private RecommendationPage recommendationPage;

    public RecommendationPage browseFirstRecommendation(){
        localChromeDriver.findElement(By.cssSelector("#vn1s0p1c0 > h3")).click();
        return recommendationPage;
    }
}
