/*
 * Copyright (c) by censhare AG
 */
package guru.springframework.sfgjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

/**
 * JMS config
 *
 * @author Martin Wunderlich
 */
@Configuration
public class JmsConfig {

    public static final String MY_QUEUE = "hello-world-queue";
    public static final String MY_SND_RECEIVE_QUEUE = "queue-with-reply";

    @Bean
    public MessageConverter messageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");

        return converter;
    }
}
