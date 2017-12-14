package com.videoaulaneri.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/exemplosrs")
public class Exemplo1 {
	
	@GET
	public String mostra() {
		
		return "Videoaulas Neri, executou um GET";
	}

}
