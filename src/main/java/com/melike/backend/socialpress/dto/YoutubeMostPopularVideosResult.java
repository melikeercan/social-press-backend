package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class YoutubeMostPopularVideosResult {
    private final String kind;
    private final String etag;
    private final String nextPageToken;
    private final PageInfo pageInfo;
    private final List<YoutubeVideo> items;

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

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public List<YoutubeVideo> getItems() {
        return items;
    }
}
