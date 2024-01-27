package dev.aziz.datageneratormicroservice.service;

import dev.aziz.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions testOptions);
}
