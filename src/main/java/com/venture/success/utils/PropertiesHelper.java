package com.venture.success.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesHelper {

    @Value("${searchKeyword}")
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    @Value("${searchBox}")
    private String searchBox;

    public String getSearchBox() {
        return searchBox;
    }

    @Value("${firstRecommendation}")
    private String firstRecommend;

    public String getFirstRecommend() {
        return firstRecommend;
    }
}
