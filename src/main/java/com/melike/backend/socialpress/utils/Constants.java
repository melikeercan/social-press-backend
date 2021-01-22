package com.melike.backend.socialpress.utils;

public class Constants {
    public static final String SEARCH_SUCCESSFULLY = "Search successfully";
    public static final String FETCH_TRENDS_SUCCESSFULLY = "Fetched trends successfully";
    public static final String FETCHED_RELATED_VIDEOS_SUCCESSFULLY = "Fetched related videos successfully";

    public static final String YOUTUBE_MOST_POPULAR_URL = "https://youtube.googleapis.com/youtube/v3/videos?part=snippet%2Cstatistics&chart=mostPopular&maxResults=30&key=";
    public static final String YOUTUBE_RELATED_VIDEOS_URL = "https://youtube.googleapis.com/youtube/v3/search?part=snippet&relatedToVideoId=tTq7JcvWH-E&type=video&key=";
}
