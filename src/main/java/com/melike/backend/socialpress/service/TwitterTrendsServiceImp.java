package com.melike.backend.socialpress.service;

import com.melike.backend.socialpress.response.TwitterSearchQueryResult;
import com.melike.backend.socialpress.response.TwitterTrendsQueryResult;
import com.melike.backend.socialpress.utils.ConfigurationSingleton;
import org.springframework.stereotype.Service;
import twitter4j.*;
import twitter4j.api.TrendsResources;
import twitter4j.conf.Configuration;

import java.util.Arrays;
import java.util.List;

@Service
public class TwitterTrendsServiceImp extends BaseServiceImp implements TwitterTrendsService {


    @Override
    public TwitterTrendsQueryResult fetchTrends() {
        List<Trend> trendList = null;
        Configuration config = ConfigurationSingleton.getInstance().getConfiguration();
        Twitter twitter = new TwitterFactory(config).getInstance();
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
