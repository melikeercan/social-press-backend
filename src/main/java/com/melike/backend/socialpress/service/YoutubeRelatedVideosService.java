package com.melike.backend.socialpress.service;

import com.melike.backend.socialpress.response.YoutubeRelatedVideosQueryResult;

public interface YoutubeRelatedVideosService {
    YoutubeRelatedVideosQueryResult searchRelated(String id);
}
