package com.lucasit.mapper;

import com.lucasit.domain.Truck;
import com.lucasit.request.TruckPostRequestBoby;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public abstract class TruckMapper {

    public static final TruckMapper INSTANCE = Mappers.getMapper(TruckMapper.class);

    @Mapping(target="name", source="truckPostRequestBoby.name")
    public abstract Truck toTruck(TruckPostRequestBoby truckPostRequestBoby);
}
