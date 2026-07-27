package com.wherethetruck.telemetry_processing_service.service;

public interface TelemetryProcessingService {

    void consumeMessage(String message);
}
