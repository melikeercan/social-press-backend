package com.melike.backend.socialpress.dto;

public class YoutubeRelatedId {
    private final String kind;
    private final String videoId;

    public YoutubeRelatedId(String kind, String videoId) {
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
