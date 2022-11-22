package com.mewada.rohit.lp.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter @Setter
public class QueueData implements Serializable {
    private Integer ID;
    private String record;
    private Timestamp pollReadyTime;
}
