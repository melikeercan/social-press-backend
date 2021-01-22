package com.melike.backend.socialpress.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PageInfo {
    public final Integer totalResults;
    public final Integer resultsPerPage;

    public PageInfo(
            @JsonProperty("totalResults") Integer totalResults, 
            @JsonProperty("resultsPerPage") Integer resultsPerPage
    ) {
        this.totalResults = totalResults;
        this.resultsPerPage = resultsPerPage;
    }
}
