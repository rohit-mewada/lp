//package com.mewada.rohit.lp.consumer;
//
//import com.mewada.rohit.lp.constants.KafkaConstants;
//import com.mewada.rohit.lp.model.KafkaWaitRecord;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//@EnableKafka
//public class KafkaConsumer {
//
//    @KafkaListener(topics = KafkaConstants.TOPIC_NAME,
//            groupId = KafkaConstants.GROUP_ID)
//    public void consume(KafkaWaitRecord kafkaWaitRecord){
//        log.info("Message received -> {} {} {}",
//                kafkaWaitRecord.getRecordNumber(),
//                kafkaWaitRecord.getDelayMs(),
//                kafkaWaitRecord.getPayload());
//    }
//}
