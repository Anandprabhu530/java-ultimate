package com.wherethetruck.gps_ingestion_service.repository;

import com.wherethetruck.gps_ingestion_service.model.TelemetryRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelemetryRecordRepository extends JpaRepository<TelemetryRecord, Long> {
}
