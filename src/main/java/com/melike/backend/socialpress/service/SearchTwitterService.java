package com.melike.backend.socialpress.service;
import com.melike.backend.socialpress.response.TwitterSearchQueryResult;

import java.util.List;

public interface SearchTwitterService {
    TwitterSearchQueryResult search(String text);
}
