package com.melike.backend.socialpress.response;

import com.melike.backend.socialpress.dto.YoutubeResult;

import java.util.List;

public class YoutubeTrendsQueryResult {
    private List<YoutubeResult> trendList;

    public YoutubeTrendsQueryResult(List<YoutubeResult> trendList) {
        this.trendList = trendList;
    }

    public List<YoutubeResult> getTrendList() {
        return trendList;
    }

    public void setTrendList(List<YoutubeResult> trendList) {
        this.trendList = trendList;
    }

}
