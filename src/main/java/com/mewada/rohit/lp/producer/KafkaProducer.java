package com.mewada.rohit.lp.producer;

import com.mewada.rohit.lp.constants.KafkaConstants;
import com.mewada.rohit.lp.model.QueueData;
import com.mewada.rohit.lp.model.Records;
import lombok.extern.slf4j.Slf4j;
import org.example.model.KafkaWaitRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, KafkaWaitRecord> kafkaTemplate;

    RestTemplate restTemplate = new RestTemplate();

    public void sendMessage(KafkaWaitRecord kafkaWaitRecord){
        log.info(String.format("Message sent -> %s", kafkaWaitRecord));
        restTemplate.postForObject("http://localhost:8081/postRecord",kafkaWaitRecord, QueueData.class);

    }

    public void sendMessageToTopic(){

        Records records = restTemplate.getForObject("http://localhost:8081/getRecord", Records.class);

        if (records==null || records.getRecordList().isEmpty()){
        } else{
            for(KafkaWaitRecord record : records.getRecordList()){
                record.setDelayMs(0);
                kafkaTemplate.send(KafkaConstants.TOPIC_NAME, record);
            }
        }

    }

}
