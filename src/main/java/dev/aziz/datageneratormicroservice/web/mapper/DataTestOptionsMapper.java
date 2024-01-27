package dev.aziz.datageneratormicroservice.web.mapper;

import dev.aziz.datageneratormicroservice.model.test.DataTestOptions;
import dev.aziz.datageneratormicroservice.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
