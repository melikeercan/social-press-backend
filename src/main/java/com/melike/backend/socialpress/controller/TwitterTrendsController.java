package com.melike.backend.socialpress.controller;

import com.melike.backend.socialpress.response.RestCallResponse;
import com.melike.backend.socialpress.response.TwitterTrendsQueryResult;
import com.melike.backend.socialpress.service.TwitterTrendsServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.melike.backend.socialpress.utils.Constants.FETCH_TRENDS_SUCCESSFULLY;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v0/trends/twitter")
public class TwitterTrendsController {

    private final TwitterTrendsServiceImp twitterTrendsService;

    public TwitterTrendsController(TwitterTrendsServiceImp twitterTrendsService) {
        this.twitterTrendsService = twitterTrendsService;
    }

    @GetMapping("/")
    @ResponseBody
    RestCallResponse twitterTrends() {
        TwitterTrendsQueryResult result = twitterTrendsService.fetchTrends();
        return new RestCallResponse(HttpStatus.OK, FETCH_TRENDS_SUCCESSFULLY, result);
    }

}
