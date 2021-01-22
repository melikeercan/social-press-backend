package com.melike.backend.socialpress.response;

import com.melike.backend.socialpress.dto.YoutubeTrend;

import java.util.List;

public class YoutubeTrendsQueryResult {
    private List<YoutubeTrend> trendList;

    public YoutubeTrendsQueryResult(List<YoutubeTrend> trendList) {
        this.trendList = trendList;
    }

    public List<YoutubeTrend> getTrendList() {
        return trendList;
    }

    public void setTrendList(List<YoutubeTrend> trendList) {
        this.trendList = trendList;
    }

}
