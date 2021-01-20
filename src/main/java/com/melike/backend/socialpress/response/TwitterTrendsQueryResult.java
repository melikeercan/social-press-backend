package com.melike.backend.socialpress.response;

import twitter4j.Trend;

import java.util.List;

public class TwitterTrendsQueryResult {

    private List<Trend> trendList;

    public TwitterTrendsQueryResult(List<Trend> trendList) {
        this.trendList = trendList;
    }

    public List<Trend> getTrendList() {
        return trendList;
    }

    public void setTrendList(List<Trend> trendList) {
        this.trendList = trendList;
    }
}
