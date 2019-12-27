package com.venture.success.Tests;

import com.venture.success.SpringConfig;
import com.venture.success.utils.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@ContextConfiguration(classes={SpringConfig.class})
public class BaseTest extends AbstractTestNGSpringContextTests {


    @Autowired
    private Helper helper;

    @Override
    @BeforeSuite
    public void springTestContextPrepareTestInstance() throws Exception {
        System.out.println("This is before suite");
        super.springTestContextPrepareTestInstance();
        helper.launchGoogle();
        helper.maximiseWindow();

    }

    @AfterSuite
    public void tearDown() {
        System.out.println("This is after suite");
        helper.closeWindow();
    }
}