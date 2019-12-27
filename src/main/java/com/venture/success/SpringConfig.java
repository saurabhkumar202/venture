package com.venture.success;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import java.util.Properties;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.venture.success")
@PropertySource({"classpath:application.properties","classpath:locator.properties"})


public class SpringConfig
{
    /*@Autowired
    Environment env;*/
    @Bean
    static PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public WebDriver localChromeDriver(){
       // System.out.println("Reading environment "+env.getProperty("searchKeyword"));
        System.setProperty("webdriver.chrome.driver","F:\\ULC-E2E-Automation\\node_modules\\protractor\\node_modules\\webdriver-manager\\selenium\\chromedriver_78.0.3904.70.exe");
        return new ChromeDriver();
    }

    @Bean
    public Properties properties()
    {
        return new Properties();
    }
}
