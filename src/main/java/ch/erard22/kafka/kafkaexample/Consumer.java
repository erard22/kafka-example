package ch.erard22.kafka.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = Producer.TOPIC, groupId="erard22-test")
    public void consume(String message) {
        log.info("Consuming message: {}", message);
    }

}
