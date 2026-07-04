package com.wherethetruck.gps_ingestion_service.service.impl;

import com.wherethetruck.gps_ingestion_service.dto.GpsTelemetryDto;
import com.wherethetruck.gps_ingestion_service.service.TelemetryIngestionService;

public class TelemetryIngestionServiceImpl implements TelemetryIngestionService {

    @Override
    public void ingestTelemetryData(GpsTelemetryDto gpsTelemetryDto){
        // Ingest into kafka // return after a small break
        return;
    }
}
