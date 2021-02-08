package com.grupocmc.tutorials.jsonnode.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.grupocmc.tutorials.jsonnode.model.InfoPeticion;

public interface InfoPeticionMapper {
	public InfoPeticion mapToInfoPeticion(ObjectNode objectNode) throws JsonMappingException, JsonProcessingException;
}
