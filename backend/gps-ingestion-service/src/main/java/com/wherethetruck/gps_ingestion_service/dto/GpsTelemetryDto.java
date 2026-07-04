package com.wherethetruck.gps_ingestion_service.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class GpsTelemetryDto {

    private UUID vehicleId;
    private Double latitude;
    private Double longitude;
    private Double speed;
    private int direction;
    private boolean ignitionStatus;
}
