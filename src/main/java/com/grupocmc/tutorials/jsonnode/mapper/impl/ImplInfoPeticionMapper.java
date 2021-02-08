package com.grupocmc.tutorials.jsonnode.mapper.impl;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.grupocmc.tutorials.jsonnode.mapper.InfoPeticionMapper;
import com.grupocmc.tutorials.jsonnode.model.InfoPeticion;
import com.grupocmc.tutorials.jsonnode.model.InfoReporte;
import com.grupocmc.tutorials.jsonnode.model.InfoTitular;
import com.grupocmc.tutorials.jsonnode.model.InfoTransaccion;

@Service
public class ImplInfoPeticionMapper implements InfoPeticionMapper{
	@Override
	public InfoPeticion mapToInfoPeticion(ObjectNode objectNode) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		InfoTitular titularPeticion = objectMapper.readValue(objectNode.get("infoTitular").toPrettyString(), InfoTitular.class);
		InfoTransaccion transaccionPeticion = objectMapper.readValue(objectNode.get("infoTransaccion").toPrettyString(), InfoTransaccion.class);
		InfoReporte reportePeticion = objectMapper.readValue(objectNode.get("infoReporte").toPrettyString(), InfoReporte.class);		
		return new InfoPeticion(titularPeticion, transaccionPeticion, reportePeticion);
	}
}
