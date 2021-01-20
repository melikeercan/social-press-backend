package com.melike.backend.socialpress.service;

import com.melike.backend.socialpress.response.TwitterSearchQueryResult;
import com.melike.backend.socialpress.utils.ConfigurationSingleton;
import com.melike.backend.socialpress.utils.ConverterUtils;
import org.springframework.stereotype.Service;
import twitter4j.*;
import twitter4j.conf.Configuration;

@Service
public class SearchTwitterServiceImp extends BaseServiceImp implements SearchTwitterService {

    @Override
    public TwitterSearchQueryResult search(String text){
        System.out.println("searching: " + text);
        TwitterSearchQueryResult twitterSearchQueryResult = null;
        Configuration config = ConfigurationSingleton.getInstance().getConfiguration();
        Twitter twitter = new TwitterFactory(config).getInstance();
        try {
            QueryResult result = twitter.search(new Query(text));
            System.out.println(result);
            ConverterUtils converterUtils = new ConverterUtils();
            twitterSearchQueryResult = converterUtils.converter(result);
        } catch (TwitterException te) {
            te.printStackTrace();
        }
        return twitterSearchQueryResult;
    }
}
