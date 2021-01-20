package com.melike.backend.socialpress.controller;

import com.melike.backend.socialpress.response.RestCallResponse;
import com.melike.backend.socialpress.response.TwitterSearchQueryResult;
import com.melike.backend.socialpress.service.SearchTwitterServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.melike.backend.socialpress.utils.Constants.SEARCH_SUCCESSFULLY;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v0/search/twitter")
public class SearchTwitterController {

    private final SearchTwitterServiceImp searchTwitterService;

    public SearchTwitterController(SearchTwitterServiceImp searchTwitterService) {
        this.searchTwitterService = searchTwitterService;
    }


    @GetMapping("/")
    @ResponseBody
    RestCallResponse searchTwitter() {
        return new RestCallResponse(HttpStatus.OK, "works",
                "hello");
    }

    @GetMapping("/text={text}")
    RestCallResponse searchTwitter(@PathVariable("text") String text) {
        TwitterSearchQueryResult serviceResult = searchTwitterService.search(text);
        System.out.println(serviceResult);
        return new RestCallResponse(HttpStatus.OK, SEARCH_SUCCESSFULLY, serviceResult);
    }
}
