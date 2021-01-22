package com.melike.backend.socialpress.utils;

import com.melike.backend.socialpress.dto.YoutubeMostPopularVideosResult;
import com.melike.backend.socialpress.dto.YoutubeRelatedVideoResult;
import com.melike.backend.socialpress.dto.YoutubeResult;
import com.melike.backend.socialpress.response.TwitterSearchQueryResult;
import com.melike.backend.socialpress.response.YoutubeRelatedVideosQueryResult;
import com.melike.backend.socialpress.response.YoutubeTrendsQueryResult;
import twitter4j.QueryResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterUtils {

    public static TwitterSearchQueryResult convertToTwitterResult(QueryResult result) {
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

    public static YoutubeTrendsQueryResult convertToYoutubeResult(YoutubeMostPopularVideosResult result) {
        List<YoutubeResult> trendList = result.getItems().stream()
                .map(item -> new YoutubeResult(item.getId(), item.getSnippet().getTitle()))
                .collect(Collectors.toList());
        System.out.println(trendList);
        return new YoutubeTrendsQueryResult(trendList);
    }

    public static YoutubeRelatedVideosQueryResult convertToYoutubeRelatedVideosResult(YoutubeRelatedVideoResult result) {
        List<YoutubeResult> relatedList = result.getItems().stream()
                .map(item -> new YoutubeResult(item.getId().getVideoId(), item.getSnippet().getTitle()))
                .collect(Collectors.toList());
        System.out.println(relatedList);
        return new YoutubeRelatedVideosQueryResult(relatedList);
    }
}
