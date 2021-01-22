package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Snippet {
    private final String channelId;
    private final String title;
    private final String description;
    private final String channelTitle;
    private final List<String> tags;

    public Snippet(
            @JsonProperty("channelId") String channelId,
            @JsonProperty("title") String title,
            @JsonProperty("description") String description,
            @JsonProperty("channelTitle") String channelTitle,
            @JsonProperty("tags") List<String> tags
    ) {
        this.channelId = channelId;
        this.title = title;
        this.description = description;
        this.channelTitle = channelTitle;
        this.tags = tags;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public List<String> getTags() {
        return tags;
    }
}
