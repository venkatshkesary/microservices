package com.innominds.training.jmsconsumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingsListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingsListener.class);

    public void handleMessage(final String message) {
        GreetingsListener.LOGGER.info("Received message - {}", message);
    }
}
