package com.melike.backend.socialpress.service;


import java.io.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.melike.backend.socialpress.dto.YoutubeMostPopularVideosResult;
import com.melike.backend.socialpress.response.YoutubeTrendsQueryResult;
import com.melike.backend.socialpress.utils.ConverterUtils;
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
    public YoutubeTrendsQueryResult fetchTrends() {
        YoutubeTrendsQueryResult result = null;
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(YOUTUBE_MOST_POPULAR_URL + apiKey);
            YoutubeMostPopularVideosResult response = client.execute(request, httpResponse ->
                    mapper.readValue(httpResponse.getEntity().getContent(),
                            YoutubeMostPopularVideosResult.class));
            result = ConverterUtils.convertToYoutubeResult(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
