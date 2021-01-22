package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SnippetRelated {
    private final String channelId;
    private final String title;
    private final String description;
    private final String channelTitle;

    public SnippetRelated(
            @JsonProperty("channelId") String channelId,
            @JsonProperty("title") String title,
            @JsonProperty("description") String description,
            @JsonProperty("channelTitle") String channelTitle
    ) {
        this.channelId = channelId;
        this.title = title;
        this.description = description;
        this.channelTitle = channelTitle;
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

}
