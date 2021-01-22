package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YoutubeRelatedVideo {
    private final String kind;
    private final String etag;
    private final YoutubeRelatedId id;
    private final Statistics statistics;
    private final Snippet snippet;

    public YoutubeRelatedVideo(
            @JsonProperty("kind") String kind,
            @JsonProperty("etag") String etag,
            @JsonProperty("id") YoutubeRelatedId id,
            @JsonProperty("statistics") Statistics statistics,
            @JsonProperty("snippet") Snippet snippet) {
        this.kind = kind;
        this.etag = etag;
        this.id = id;
        this.statistics = statistics;
        this.snippet = snippet;
    }

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag;
    }

    public YoutubeRelatedId getId() {
        return id;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public Snippet getSnippet() {
        return snippet;
    }
}
