package com.wherethetruck.gps_ingestion_service.service.impl;

import com.wherethetruck.gps_ingestion_service.config.KafkaProducer;
import com.wherethetruck.gps_ingestion_service.dto.GpsTelemetryDto;
import com.wherethetruck.gps_ingestion_service.service.TelemetryIngestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Service
public class TelemetryIngestionServiceImpl implements TelemetryIngestionService {

    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void ingestTelemetryData(GpsTelemetryDto gpsTelemetryDto){
        // Ingest into kafka // return after a small break
        String sample = objectMapper.writeValueAsString(gpsTelemetryDto);
        kafkaProducer.publishMessage(gpsTelemetryDto.getVehicleId(), sample);
    }
}
