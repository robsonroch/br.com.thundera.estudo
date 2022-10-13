package br.com.thunderaestudo.entities;

import br.com.thunderaestudo.openapi.model.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
	
	  private String idVehicle;

	  private String modelVehicle;

	  private VehicleType vehicleType;
	  
	  private String idDriver;

}
