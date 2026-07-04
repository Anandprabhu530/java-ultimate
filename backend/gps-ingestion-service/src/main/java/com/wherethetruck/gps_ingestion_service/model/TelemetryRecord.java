package com.wherethetruck.gps_ingestion_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name= "TELEMETRY_RECORD")
public class TelemetryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "VEHICLE_ID")
    private UUID vehicleId;

    @Column(name ="LATITUDE")
    private Double latitude;

    @Column(name ="LONGITUDE")
    private Double longitude;

    @Column(name ="SPEED")
    private Double speed;

    @Column(name ="TIMESTAMP")
    private Long timestamp;
}
