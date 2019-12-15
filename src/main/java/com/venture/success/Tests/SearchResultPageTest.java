package com.venture.success.Tests;

import com.venture.success.Pages.GoogleSearchResultPage;
import com.venture.success.Pages.HomePage;
import com.venture.success.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = {SpringConfig.class})
public class SearchResultPageTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private HomePage homePage;

    @Autowired
    private GoogleSearchResultPage googleSearchResultPage;

    @Test(priority = 0)
    public void searchResult() {
        System.out.println("The home Pae object on search page is" + homePage);
        googleSearchResultPage.browseFirstRecommendation();
    }

}
