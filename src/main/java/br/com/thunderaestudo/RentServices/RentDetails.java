package br.com.thunderaestudo.RentServices;

import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentDetails {
	
	private Double taxValue;
	private Double issValue;
	private Boolean driverIsOk;

}
