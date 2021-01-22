package com.melike.backend.socialpress.response;

import java.util.List;

public class YoutubeRelatedVideosQueryResult {
    private List<String> youtubeIds;

    private YoutubeRelatedVideosQueryResult() {}

    public YoutubeRelatedVideosQueryResult(List<String> youtubeIds) {
        this.youtubeIds = youtubeIds;
    }
}
