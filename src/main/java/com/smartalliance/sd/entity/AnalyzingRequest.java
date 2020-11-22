package com.smartalliance.sd.entity;

import com.smartalliance.sd.enums.AnalyzingResult;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AnalyzingRequest {
    private long id;

    private Client client;
    private Partner partner;
    private FrameInfo frameInfo;
    private Device device;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    private AnalyzingResult analyzingResult;
    private AnalyzingResult operatorResult;
}
