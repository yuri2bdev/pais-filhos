package com.parents.paisfilhos.pais.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class PaisController implements PaisAPI {

	@Override
	public PaisResponse postPais(PaisRequest paisRequest) {
		log.info("[inicia] PaisController - postPais");
		log.info("[finaliza] PaisController - postPais");
		
		
		
		return null;
	}

}
