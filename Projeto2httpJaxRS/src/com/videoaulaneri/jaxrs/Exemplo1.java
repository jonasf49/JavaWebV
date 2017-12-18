//videoaulas neri
package com.videoaulaneri.jaxrs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/exemplowsrs")
public class Exemplo1 {
	
	
    //CTRL+SHIFT+O importa bibliotecas
	
	@GET
	public String executaGet() {
		return "Videoaulas Neri, executou um GET";
	}
	
	@POST
	public String executaPost() {
		return "Videoaulas Neri, executou um POST";
	}
	
}
