package ru.ilia.springclones.controller;

import org.springframework.web.bind.annotation.*;
import ru.ilia.springclones.kafka.KafkaProducer;
import ru.ilia.springclones.model.Clone;
import ru.ilia.springclones.service.CloneService;

@RestController
public class KafkaController {
    private final KafkaProducer kafkaProducer;
    private final CloneService service;
    public KafkaController (KafkaProducer kafkaProducer, CloneService service){
        this.kafkaProducer=kafkaProducer;
        this.service = service;
    }
    @PostMapping("/kafka/send/{id}")
    public String sendMess(@PathVariable int id) {
        var clone = service.findByNumber(id);
        kafkaProducer.sendMessage(clone.toString());
        return "Success";
    }

}
