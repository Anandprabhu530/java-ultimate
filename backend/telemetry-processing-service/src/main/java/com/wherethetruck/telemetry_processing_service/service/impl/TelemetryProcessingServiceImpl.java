package com.wherethetruck.telemetry_processing_service.service.impl;

import com.wherethetruck.telemetry_processing_service.service.TelemetryProcessingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TelemetryProcessingServiceImpl implements TelemetryProcessingService {

    private static final String INGESTION_TOPIC = "gps-ingestion";

    @KafkaListener(topics = INGESTION_TOPIC)
    public void consumeMessage(String message){
        log.info("Received Telemetry Message: {}" , message);
    }
}
