package com.melike.backend.socialpress.response;

import java.util.List;

public class TwitterSearchQueryResult {

    private Long sinceId;
    private Long maxId;
    private String refreshUrl;
    private Integer count;
    private Double completedIn;
    private String query;
    private List<String> tweetIds;
    private Boolean hasNext;
    private Integer accessLevel;

    private TwitterSearchQueryResult() {}

    public TwitterSearchQueryResult(
            Long sinceId,
            Long maxId,
            String refreshUrl,
            Integer count,
            Double completedIn,
            String query,
            List<String> tweetIds,
            Boolean hasNext,
            Integer accessLevel
    ) {
        this.sinceId = sinceId;
        this.maxId = maxId;
        this.refreshUrl = refreshUrl;
        this.count = count;
        this.completedIn = completedIn;
        this.query = query;
        this.tweetIds = tweetIds;
        this.hasNext = hasNext;
        this.accessLevel = accessLevel;
    }

    public Long getSinceId() {
        return sinceId;
    }

    public void setSinceId(Long sinceId) {
        this.sinceId = sinceId;
    }

    public Long getMaxId() {
        return maxId;
    }

    public void setMaxId(Long maxId) {
        this.maxId = maxId;
    }

    public String getRefreshUrl() {
        return refreshUrl;
    }

    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getCompletedIn() {
        return completedIn;
    }

    public void setCompletedIn(Double completedIn) {
        this.completedIn = completedIn;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<String> getTweetIds() {
        return tweetIds;
    }

    public void setTweetIds(List<String> tweetIds) {
        this.tweetIds = tweetIds;
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }


}
