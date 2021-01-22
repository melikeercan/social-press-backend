package com.melike.backend.socialpress.response;

import com.melike.backend.socialpress.dto.YoutubeResult;

import java.util.List;

public class YoutubeRelatedVideosQueryResult {
    private List<YoutubeResult> youtubeResults;

    private YoutubeRelatedVideosQueryResult() {}

    public YoutubeRelatedVideosQueryResult(List<YoutubeResult> youtubeResults) {
        this.youtubeResults = youtubeResults;
    }
}
