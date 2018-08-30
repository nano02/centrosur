package com.utec.ws;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/ciudades")
public class CiudadesRest {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ciudad> getCiudades() {
		return CiudadesRepository.getInstance().getCiudades();
	}
}
