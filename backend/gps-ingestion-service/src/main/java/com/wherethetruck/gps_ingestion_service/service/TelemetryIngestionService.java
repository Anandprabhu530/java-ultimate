package com.wherethetruck.gps_ingestion_service.service;

import com.wherethetruck.gps_ingestion_service.dto.GpsTelemetryDto;

public interface TelemetryIngestionService {

    void ingestTelemetryData(GpsTelemetryDto gpsTelemetryDto);
}
