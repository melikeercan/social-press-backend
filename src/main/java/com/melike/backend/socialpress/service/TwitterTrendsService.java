package com.melike.backend.socialpress.service;
import com.melike.backend.socialpress.response.TwitterTrendsQueryResult;

public interface TwitterTrendsService {
    TwitterTrendsQueryResult fetchTrends();
}
