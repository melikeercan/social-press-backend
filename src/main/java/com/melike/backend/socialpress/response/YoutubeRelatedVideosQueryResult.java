package com.melike.backend.socialpress.response;

import com.melike.backend.socialpress.dto.YoutubeResult;

import java.util.List;

public class YoutubeRelatedVideosQueryResult {
    private List<YoutubeResult> youtubeResults;

    public YoutubeRelatedVideosQueryResult(List<YoutubeResult> youtubeResults) {
        this.youtubeResults = youtubeResults;
    }

    public List<YoutubeResult> getYoutubeResults() {
        return youtubeResults;
    }

    public void setYoutubeResults(List<YoutubeResult> youtubeResults) {
        this.youtubeResults = youtubeResults;
    }
}
