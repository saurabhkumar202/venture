package com.venture.success.Tests;

import com.venture.success.Pages.HomePage;
import com.venture.success.SpringConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.venture.success.utils.*;


@ContextConfiguration(classes={SpringConfig.class})
public class HomePageTest extends AbstractTestNGSpringContextTests {


    @Autowired
    private HomePage homePage;


    @Test(priority = 0)
    public void launchGoogleAndVerifyTitle(){
        Assert.assertEquals(homePage.getGoogleTitle(),"Google");
        homePage.performGoogleSearchForResults();

    }



}


