package com.melike.backend.socialpress.service;


import java.io.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.melike.backend.socialpress.response.YoutubeMostPopularVideosResult;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static com.melike.backend.socialpress.utils.Constants.YOUTUBE_MOST_POPULAR_URL;


@Service
public class YoutubeTrendsServiceImp implements YoutubeTrendsService{

    @Value("${youtube.apiKey}")
    private String apiKey;

    @Override
    public YoutubeMostPopularVideosResult fetchTrends() {
        YoutubeMostPopularVideosResult response = null;
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(YOUTUBE_MOST_POPULAR_URL + apiKey);
            response = client.execute(request, httpResponse ->
                    mapper.readValue(httpResponse.getEntity().getContent(),
                            YoutubeMostPopularVideosResult.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
