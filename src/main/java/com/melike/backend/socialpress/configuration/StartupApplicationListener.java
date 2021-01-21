package com.melike.backend.socialpress.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;


@Component
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(StartupApplicationListener.class);
    @Value("${twitter.consumerKey}")
    private String consumerKey;
    @Value("${twitter.consumerSecret}")
    private String consumerSecret;
    @Value("${twitter.accessKey}")
    private String accessKey;
    @Value("${twitter.accessSecret}")
    private String accessSecret;

    private static Configuration configuration;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey(consumerKey)
                .setOAuthConsumerSecret(consumerSecret)
                .setOAuthAccessToken(accessKey)
                .setOAuthAccessTokenSecret(accessSecret);
        this.setConfiguration(configurationBuilder.build());
        logger.info("[onApplicationEvent][TwitterConfiguration]["+configuration.getMediaProvider()+"]");
    }

    public static Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}
