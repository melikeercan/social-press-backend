package com.melike.backend.socialpress.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APOD {
    public final String kind;
    public final String etag;
    public final String nextPageToken;
    public final String regionCode;
    public final Object pageInfo;
    public final Object items;

    public APOD(@JsonProperty("kind") String kind,
                @JsonProperty("etag") String etag,
                @JsonProperty("nextPageToken") String nextPageToken,
                @JsonProperty("regionCode") String regionCode,
                @JsonProperty("pageInfo") Object pageInfo,
                @JsonProperty("items") Object items) {
        this.kind = kind;
        this.etag = etag;
        this.nextPageToken = nextPageToken;
        this.regionCode = regionCode;
        this.pageInfo = pageInfo;
        this.items = items;
    }
}