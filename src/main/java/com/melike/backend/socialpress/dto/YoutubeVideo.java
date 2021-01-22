package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YoutubeVideo {
    public final String kind;
    public final String etag;
    public final String id;
    public final Statistics statistics;
    public final Snippet snippet;

    public YoutubeVideo(
            @JsonProperty("kind") String kind,
            @JsonProperty("etag") String etag,
            @JsonProperty("id") String id,
            @JsonProperty("statistics") Statistics statistics,
            @JsonProperty("snippet") Snippet snippet) {
        this.kind = kind;
        this.etag = etag;
        this.id = id;
        this.statistics = statistics;
        this.snippet = snippet;
    }
}
