package com.grupocmc.tutorials.jsonnode.api;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.grupocmc.tutorials.jsonnode.mapper.InfoPeticionMapper;
import com.grupocmc.tutorials.jsonnode.model.InfoPeticion;

@RestController
@CrossOrigin(origins = "*")
public class PeticionRestController {
	@Autowired
	private InfoPeticionMapper infoPeticionMapper;
	@PostMapping("/postPeticion")
	public ResponseEntity<InfoPeticion> postPeticion(@RequestBody ObjectNode objectNodePeticion){			
		try {
			InfoPeticion infoPeticion = infoPeticionMapper.mapToInfoPeticion(objectNodePeticion);
			new URI("/getPeticion/"+infoPeticion.hashCode());
			return ResponseEntity.ok(infoPeticion);
			//return ResponseEntity.created( new URI("/getPeticion/"+infoPeticion.hashCode())).build();
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
			return ResponseEntity.badRequest().build();
		} catch(URISyntaxException e) {			
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}		
	}
}
