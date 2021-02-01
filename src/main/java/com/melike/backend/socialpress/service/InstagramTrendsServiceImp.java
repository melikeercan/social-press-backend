package com.melike.backend.socialpress.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InstagramTrendsServiceImp implements InstagramTrendsService{

    @Value("${youtube.apiKey}")
    private String accessToken;


    @Override
    public Object fetchTrends() {
        return accessToken;
    }
}
