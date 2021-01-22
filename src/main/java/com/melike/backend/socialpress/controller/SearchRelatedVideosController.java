package com.melike.backend.socialpress.controller;

import com.melike.backend.socialpress.response.RestCallResponse;
import com.melike.backend.socialpress.response.YoutubeRelatedVideosQueryResult;
import com.melike.backend.socialpress.service.YoutubeRelatedVideosServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.melike.backend.socialpress.utils.Constants.FETCHED_RELATED_VIDEOS_SUCCESSFULLY;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v0/search/youtube")
public class SearchRelatedVideosController {
    private final YoutubeRelatedVideosServiceImp youtubeRelatedVideosService;

    public SearchRelatedVideosController(YoutubeRelatedVideosServiceImp youtubeRelatedVideosService) {
        this.youtubeRelatedVideosService = youtubeRelatedVideosService;
    }

    @GetMapping("/videoId={videoId}")
    RestCallResponse searchYoutubeRelated(@PathVariable("videoId") String videoId) {
        YoutubeRelatedVideosQueryResult serviceResult = youtubeRelatedVideosService.searchRelated(videoId);
        return new RestCallResponse(HttpStatus.OK, FETCHED_RELATED_VIDEOS_SUCCESSFULLY, serviceResult);
    }
}
