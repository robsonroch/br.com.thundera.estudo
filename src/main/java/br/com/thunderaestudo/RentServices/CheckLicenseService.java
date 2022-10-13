package br.com.thunderaestudo.RentServices;

import org.springframework.stereotype.Component;

@Component
public class CheckLicenseService {
			
	public static Boolean checkLicenseDriver(String license) {
		return DetranClientService.DetranClient(license);
	}

}
