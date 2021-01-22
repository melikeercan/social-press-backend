package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class YoutubeMostPopularVideosResult {
    public final String kind;
    public final String etag;
    public final String nextPageToken;
    public final PageInfo pageInfo;
    public final List<YoutubeVideo> items;

    public YoutubeMostPopularVideosResult(
            @JsonProperty("kind") String kind,
            @JsonProperty("etag") String etag,
            @JsonProperty("nextPageToken") String nextPageToken,
            @JsonProperty("pageInfo") PageInfo pageInfo,
            @JsonProperty("items") List<YoutubeVideo> items
    ) {
        this.kind = kind;
        this.etag = etag;
        this.nextPageToken = nextPageToken;
        this.pageInfo = pageInfo;
        this.items = items;
    }
}
