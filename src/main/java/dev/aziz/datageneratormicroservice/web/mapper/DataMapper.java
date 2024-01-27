package dev.aziz.datageneratormicroservice.web.mapper;

import dev.aziz.datageneratormicroservice.model.Data;
import dev.aziz.datageneratormicroservice.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
