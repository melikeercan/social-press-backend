package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class YoutubeRelatedVideo {
    private final String kind;
    private final String etag;
    private final YoutubeRelatedId id;
    private final SnippetRelated snippet;

    public YoutubeRelatedVideo(
            @JsonProperty("kind") String kind,
            @JsonProperty("etag") String etag,
            @JsonProperty("id") YoutubeRelatedId id,
            @JsonProperty("snippet") SnippetRelated snippet) {
        this.kind = kind;
        this.etag = etag;
        this.id = id;
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

    public SnippetRelated getSnippet() {
        return snippet;
    }
}
