package com.venture.success.Tests;

import com.venture.success.Pages.HomePage;
import com.venture.success.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


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


