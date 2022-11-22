package com.mewada.rohit.lp.service;

import com.mewada.rohit.lp.producer.KafkaProducer;
import org.example.model.KafkaWaitRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LpService {

    @Autowired
    private KafkaProducer kafkaProducer;
    public void exportRequest(KafkaWaitRecord kafkaWaitRecord) {
        kafkaProducer.sendMessage(kafkaWaitRecord);

    }
}
