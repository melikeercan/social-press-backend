package com.melike.backend.socialpress.service;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.services.youtube.model.PageInfo;
import com.google.api.services.youtube.model.VideoListResponse;
import com.melike.backend.socialpress.dto.YoutubeMostPopularVideosResult;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class YoutubeTrendsServiceImp implements YoutubeTrendsService{

    @Value("${youtube.apiKey}")
    private String apiKey;

    @Override
    public Object fetchTrends() {
        return null;
    }


    public void callMe() throws IOException, GeneralSecurityException {
        System.out.println("callMe");
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            String url = "https://youtube.googleapis.com/youtube/v3/videos?part=snippet%2Cstatistics&chart=mostPopular&key=";
            HttpGet request = new HttpGet(url+apiKey);

            YoutubeMostPopularVideosResult response = client.execute(request, httpResponse ->
                    mapper.readValue(httpResponse.getEntity().getContent(), YoutubeMostPopularVideosResult.class));
            System.out.println(response.items.size());
        }
    }
}
