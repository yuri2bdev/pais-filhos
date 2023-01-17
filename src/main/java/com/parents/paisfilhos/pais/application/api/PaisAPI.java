package com.parents.paisfilhos.pais.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pais")
public interface PaisAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PaisResponse postPais(@RequestBody PaisRequest paisRequest);
}
