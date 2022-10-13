package br.com.thunderaestudo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thunderaestudo.controllers.mapper.VehicleMapper;
import br.com.thunderaestudo.entities.Vehicle;
import br.com.thunderaestudo.openapi.api.VehicleApi;
import br.com.thunderaestudo.openapi.model.VehicleRequest;
import br.com.thunderaestudo.openapi.model.VehicleResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class VehicleApiImpl implements VehicleApi {

    @Override
    public ResponseEntity<VehicleResponse> post(VehicleRequest request) {
    	
    	VehicleMapper instance = VehicleMapper.INSTANCE;
    	
        Vehicle payment = instance.map(request);

        return ResponseEntity.ok(new VehicleResponse().idVehicle("123456").statusRent(true));
    }
}
