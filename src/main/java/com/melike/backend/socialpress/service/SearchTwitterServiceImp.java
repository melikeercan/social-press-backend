package com.melike.backend.socialpress.service;

import com.melike.backend.socialpress.configuration.StartupApplicationListener;
import com.melike.backend.socialpress.response.TwitterSearchQueryResult;
import com.melike.backend.socialpress.utils.ConverterUtils;
import org.springframework.stereotype.Service;
import twitter4j.*;

@Service
public class SearchTwitterServiceImp extends BaseServiceImp implements SearchTwitterService {

    @Override
    public TwitterSearchQueryResult search(String text){
        TwitterSearchQueryResult twitterSearchQueryResult = null;
        Twitter twitter = new TwitterFactory(StartupApplicationListener.getConfiguration()).getInstance();
        try {
            QueryResult result = twitter.search(new Query(text));
            twitterSearchQueryResult = ConverterUtils.convertToTwitterResult(result);
        } catch (TwitterException te) {
            te.printStackTrace();
        }
        return twitterSearchQueryResult;
    }
}
