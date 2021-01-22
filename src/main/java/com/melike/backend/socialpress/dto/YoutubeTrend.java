package com.melike.backend.socialpress.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class YoutubeTrend implements Serializable {
    private final String id;
    private final String title;

    public YoutubeTrend(String id, String title) {
        this.id = id;
        this.title = title;
    }
}
