package com.mewada.rohit.lp.util;

import com.mewada.rohit.lp.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RunAfterStartup {

    @Autowired
    KafkaProducer kafkaProducer;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        while (true){
            kafkaProducer.sendMessageToTopic();
        }
    }
}