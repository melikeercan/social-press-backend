package com.melike.backend.socialpress.service;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
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
        ObjectMapper mapper = new ObjectMapper();

        try (CloseableHttpClient client = HttpClients.createDefault()) {

            HttpGet request = new HttpGet("https://youtube.googleapis.com/youtube/v3/search?part=snippet&q=the%20weeknd&key="+apiKey);

            APOD response = client.execute(request, httpResponse ->
                    mapper.readValue(httpResponse.getEntity().getContent(), APOD.class));

            System.out.println(response.items);
        }
    }
}
