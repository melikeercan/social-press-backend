package com.melike.backend.socialpress.service;

import com.melike.backend.socialpress.dto.YoutubeMostPopularVideosResult;

public interface YoutubeTrendsService {
    YoutubeMostPopularVideosResult fetchTrends();
}
