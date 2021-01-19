package com.melike.backend.socialpress.controller;

import com.melike.backend.socialpress.response.RestCallResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v0/hello")
public class HelloWorldController {

    @GetMapping("/")
    @ResponseBody
    RestCallResponse hello() {
        return new RestCallResponse(HttpStatus.OK, "works",
                "hello");
    }
}
