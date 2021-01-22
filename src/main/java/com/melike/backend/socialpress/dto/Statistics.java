package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Statistics {
    private final Long viewCount;
    private final Long likeCount;
    private final Long dislikeCount;
    private final Long favoriteCount;

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

    public Long getViewCount() {
        return viewCount;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public Long getDislikeCount() {
        return dislikeCount;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }
}
