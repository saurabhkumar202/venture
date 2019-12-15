package com.venture.success;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.venture.success")
public class SpringConfig
{
    @Bean
    public WebDriver localChromeDriver(){
        System.setProperty("webdriver.chrome.driver","F:\\ULC-E2E-Automation\\node_modules\\protractor\\node_modules\\webdriver-manager\\selenium\\chromedriver_78.0.3904.70.exe");
        return new ChromeDriver();
    }
}
