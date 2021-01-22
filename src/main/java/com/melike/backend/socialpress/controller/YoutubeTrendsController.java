package com.melike.backend.socialpress.controller;

import com.melike.backend.socialpress.response.YoutubeMostPopularVideosResult;
import com.melike.backend.socialpress.response.RestCallResponse;
import com.melike.backend.socialpress.service.YoutubeTrendsServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.melike.backend.socialpress.utils.Constants.FETCH_TRENDS_SUCCESSFULLY;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v0/trends/twitter")
public class YoutubeTrendsController {

    private final YoutubeTrendsServiceImp youtubeTrendsService;

    public YoutubeTrendsController(YoutubeTrendsServiceImp youtubeTrendsService) {
        this.youtubeTrendsService = youtubeTrendsService;
    }

    @GetMapping("/")
    @ResponseBody
    RestCallResponse twitterTrends() {
        YoutubeMostPopularVideosResult result = youtubeTrendsService.fetchTrends();
        return new RestCallResponse(HttpStatus.OK, FETCH_TRENDS_SUCCESSFULLY, result);
    }

}
