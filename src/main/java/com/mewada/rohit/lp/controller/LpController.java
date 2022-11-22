package com.mewada.rohit.lp.controller;

import com.mewada.rohit.lp.service.LpService;
import org.example.model.KafkaWaitRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LpController {

    @Autowired
    private LpService service;

    @PostMapping("sendRecord")
    public void exportRequest(@RequestBody KafkaWaitRecord kafkaWaitRecord){
        service.exportRequest(kafkaWaitRecord);
    }

}
