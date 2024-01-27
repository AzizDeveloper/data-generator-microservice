package dev.aziz.datageneratormicroservice.service;

import dev.aziz.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
