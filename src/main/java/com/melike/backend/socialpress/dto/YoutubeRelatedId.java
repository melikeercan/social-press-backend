package com.melike.backend.socialpress.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class YoutubeRelatedId {
    private final String kind;
    private final String videoId;

    public YoutubeRelatedId(
            @JsonProperty("kind") String kind,
            @JsonProperty("videoId") String videoId) {
        this.kind = kind;
        this.videoId = videoId;
    }

    public String getKind() {
        return kind;
    }

    public String getVideoId() {
        return videoId;
    }
}
