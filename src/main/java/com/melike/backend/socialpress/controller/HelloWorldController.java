package com.melike.backend.socialpress.controller;

import com.melike.backend.socialpress.response.RestCallResponse;
import com.melike.backend.socialpress.service.TwitterTrendsServiceImp;
import com.melike.backend.socialpress.service.YoutubeTrendsServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v0/hello")
public class HelloWorldController {

    private final YoutubeTrendsServiceImp youtubeTrendsServiceImp;

    public HelloWorldController(YoutubeTrendsServiceImp youtubeTrendsServiceImp) {
        this.youtubeTrendsServiceImp = youtubeTrendsServiceImp;
    }

    @GetMapping("/")
    @ResponseBody
    RestCallResponse hello() {
        try {
            youtubeTrendsServiceImp.callMe();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        return new RestCallResponse(HttpStatus.OK, "works",
                "hello");
    }
}
