package com.melike.backend.socialpress.service;
import com.melike.backend.socialpress.response.TwitterSearchQueryResult;

public interface SearchTwitterService {
    TwitterSearchQueryResult search(String text);
}
