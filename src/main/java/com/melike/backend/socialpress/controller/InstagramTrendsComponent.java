package com.melike.backend.socialpress.controller;

import com.melike.backend.socialpress.response.RestCallResponse;
import com.melike.backend.socialpress.service.InstagramTrendsServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.melike.backend.socialpress.utils.Constants.FETCH_TRENDS_SUCCESSFULLY;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v0/trends/instagram")
public class InstagramTrendsComponent {

    private final InstagramTrendsServiceImp instagramTrendsService;

    public InstagramTrendsComponent(InstagramTrendsServiceImp instagramTrendsService) {
        this.instagramTrendsService = instagramTrendsService;
    }

    @GetMapping("/")
    @ResponseBody
    RestCallResponse instagramTrends() {
        Object result = instagramTrendsService.fetchTrends();
        return new RestCallResponse(HttpStatus.OK, FETCH_TRENDS_SUCCESSFULLY, result);
    }
}
