package ch.erard22.kafka.kafkaexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Producer {

    static final String TOPIC = "erard22";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Sending message: {}", message);
        this.kafkaTemplate.send(TOPIC, message);
    }
}
