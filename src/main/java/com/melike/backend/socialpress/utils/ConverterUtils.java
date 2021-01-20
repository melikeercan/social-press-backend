package com.melike.backend.socialpress.utils;

import com.melike.backend.socialpress.response.TwitterSearchQueryResult;
import twitter4j.QueryResult;
import twitter4j.TwitterResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterUtils {

    public TwitterSearchQueryResult converter(QueryResult result) {
        return new TwitterSearchQueryResult(
                result.getSinceId(),
                result.getMaxId(),
                result.getRefreshURL(),
                result.getCount(),
                result.getCompletedIn(),
                result.getQuery(),
                result.getTweets().stream().map(tweet -> String.valueOf(tweet.getId())).collect(Collectors.toList()),
                result.hasNext(),
                result.getAccessLevel());
    }
}
