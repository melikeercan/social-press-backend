package com.melike.backend.socialpress.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class YoutubeResult implements Serializable {
    private final String id;
    private final String title;

    public YoutubeResult(
            @JsonProperty("id") String id,
            @JsonProperty("title") String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
