package com.melike.backend.socialpress.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.melike.backend.socialpress.dto.YoutubeRelatedVideoResult;
import com.melike.backend.socialpress.response.YoutubeRelatedVideosQueryResult;
import com.melike.backend.socialpress.utils.ConverterUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import static com.melike.backend.socialpress.utils.Constants.YOUTUBE_RELATED_VIDEOS_URL;

@Service
public class YoutubeRelatedVideosServiceImp extends BaseServiceImp implements YoutubeRelatedVideosService{

    @Value("${youtube.apiKey}")
    private String apiKey;

    @Override
    public YoutubeRelatedVideosQueryResult searchRelated(String id) {
        YoutubeRelatedVideosQueryResult result = null;

        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            String url = YOUTUBE_RELATED_VIDEOS_URL + id + "&type=video&key=" + apiKey;
            System.out.println(url);
            HttpGet request = new HttpGet(url);
            YoutubeRelatedVideoResult response = client.execute(request, httpResponse ->
                    mapper.readValue(httpResponse.getEntity().getContent(),
                            YoutubeRelatedVideoResult.class));
            result = ConverterUtils.convertToYoutubeRelatedVideosResult(response);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
