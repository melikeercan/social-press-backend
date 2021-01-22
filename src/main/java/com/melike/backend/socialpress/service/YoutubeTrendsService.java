package com.melike.backend.socialpress.service;

import com.melike.backend.socialpress.response.YoutubeMostPopularVideosResult;

public interface YoutubeTrendsService {
    YoutubeMostPopularVideosResult fetchTrends();
}
