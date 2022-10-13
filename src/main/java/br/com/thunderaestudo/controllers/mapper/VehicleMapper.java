package br.com.thunderaestudo.controllers.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.thunderaestudo.entities.Vehicle;
import br.com.thunderaestudo.openapi.model.VehicleRequest;

@Mapper(componentModel= "spring")
public interface VehicleMapper {

	VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);

    @Mapping(source = "idVehicle", target = "idVehicle")
    @Mapping(source = "modelVehicle", target = "modelVehicle")
    @Mapping(source = "vehicleType", target = "vehicleType")
    Vehicle map(VehicleRequest request);
}