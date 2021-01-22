package com.melike.backend.socialpress.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.melike.backend.socialpress.dto.YoutubeMostPopularVideosResult;
import com.melike.backend.socialpress.response.YoutubeRelatedVideosQueryResult;
import com.melike.backend.socialpress.utils.ConverterUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

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
            HttpGet request = new HttpGet(YOUTUBE_RELATED_VIDEOS_URL + apiKey);
            client.execute(request, httpResponse -> {
                InputStream content = httpResponse.getEntity().getContent();
                System.out.println(httpResponse.getEntity().getContent());
                return content;
            });
            YoutubeMostPopularVideosResult response = client.execute(request, httpResponse ->
                    mapper.readValue(httpResponse.getEntity().getContent(),
                            YoutubeMostPopularVideosResult.class));
            result = ConverterUtils.convertToYoutubeRelatedVideosResult();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
