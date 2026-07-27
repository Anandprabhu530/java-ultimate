package com.wherethetruck.gps_ingestion_service.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ser.jdk.StringSerializer;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class KafkaProducer {

    private static final String INGESTION_TOPIC = "gps-ingestion";
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishMessage(UUID vehicleId, String jsonMessage){
        kafkaTemplate.send(INGESTION_TOPIC, vehicleId.toString(), jsonMessage);
    }
}
