package dev.aziz.datageneratormicroservice.web.controller;

import dev.aziz.datageneratormicroservice.model.Data;
import dev.aziz.datageneratormicroservice.model.test.DataTestOptions;
import dev.aziz.datageneratormicroservice.service.KafkaDataService;
import dev.aziz.datageneratormicroservice.service.TestDataService;
import dev.aziz.datageneratormicroservice.web.dto.DataDto;
import dev.aziz.datageneratormicroservice.web.dto.DataTestOptionsDto;
import dev.aziz.datageneratormicroservice.web.mapper.DataMapper;
import dev.aziz.datageneratormicroservice.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto dataTestOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(dataTestOptionsDto);
        testDataService.sendMessages(testOptions);

    }
}
