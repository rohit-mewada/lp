package com.mewada.rohit.lp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic KafkaWaitTopic(){
        return TopicBuilder.name("wait_topic")
                .build();
    }
//
//    @Bean
//    public NewTopic KafkaReadyTopic(){
//        return TopicBuilder.name("ready_topic")
//                .build();
//    }
}
