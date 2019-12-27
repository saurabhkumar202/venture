package com.venture.success.Pages;

import com.venture.success.utils.PropertiesHelper;
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

    @Autowired
    private PropertiesHelper propertiesHelper;

    public RecommendationPage browseFirstRecommendation(){
        localChromeDriver.findElement(By.cssSelector(propertiesHelper.getFirstRecommend())).click();
        return recommendationPage;
    }
}
