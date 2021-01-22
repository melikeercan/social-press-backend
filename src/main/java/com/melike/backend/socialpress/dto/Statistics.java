package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Statistics {
    public final Long viewCount;
    public final Long likeCount;
    public final Long dislikeCount;
    public final Long favoriteCount;

    public Statistics(
            @JsonProperty("viewCount") Long viewCount,
            @JsonProperty("likeCount") Long likeCount,
            @JsonProperty("dislikeCount") Long dislikeCount,
            @JsonProperty("favoriteCount") Long favoriteCount
    ) {
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
        this.favoriteCount = favoriteCount;
    }
}
