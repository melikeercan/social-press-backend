package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class YoutubeVideo {
    private final String kind;
    private final String etag;
    private final String id;
    private final Statistics statistics;
    private final Snippet snippet;

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

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag;
    }

    public String getId() {
        return id;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public Snippet getSnippet() {
        return snippet;
    }
}
