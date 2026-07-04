package com.wherethetruck.gps_ingestion_service.controller;

import com.wherethetruck.gps_ingestion_service.dto.GpsTelemetryDto;
import com.wherethetruck.gps_ingestion_service.service.TelemetryIngestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/telemetry")
public class TelemetryIngestionController {

    @Autowired
    private TelemetryIngestionService telemetryIngestionService;

    @PostMapping("/ingest")
    public void ingestTelemtryData(@RequestBody GpsTelemetryDto gpsTelemetryDto){
        telemetryIngestionService.ingestTelemetryData(gpsTelemetryDto);
        return;
    }
}
