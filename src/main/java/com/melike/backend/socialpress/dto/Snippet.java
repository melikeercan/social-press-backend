package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Snippet {
    public final String channelId;
    public final String title;
    public final String description;
    public final String channelTitle;
    public final List<String> tags;


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
}
