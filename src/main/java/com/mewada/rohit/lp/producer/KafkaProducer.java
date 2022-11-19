package com.mewada.rohit.lp.producer;

import com.mewada.rohit.lp.constants.KafkaConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(Object kafkaWaitRecord){
        log.info(String.format("Message sent -> %s", kafkaWaitRecord));
        kafkaTemplate.send(KafkaConstants.TOPIC_NAME, kafkaWaitRecord);
    }
}
