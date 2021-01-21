package com.melike.backend.socialpress.service;

import com.melike.backend.socialpress.configuration.StartupApplicationListener;
import com.melike.backend.socialpress.response.TwitterTrendsQueryResult;
import org.springframework.stereotype.Service;
import twitter4j.*;

import java.util.Arrays;
import java.util.List;

@Service
public class TwitterTrendsServiceImp extends BaseServiceImp implements TwitterTrendsService {
    @Override
    public TwitterTrendsQueryResult fetchTrends() {
        List<Trend> trendList = null;
        Twitter twitter = new TwitterFactory(StartupApplicationListener.getConfiguration()).getInstance();
        try {
            Trends trends = twitter.getPlaceTrends(1);
            System.out.println(trends);
            trendList = Arrays.asList(trends.getTrends());
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return new TwitterTrendsQueryResult(trendList);
    }
}
