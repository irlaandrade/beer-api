package com.digitalinnovationeone.beerstock.mapper;

import com.digitalinnovationeone.beerstock.dto.BeerDTO;
import com.digitalinnovationeone.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
