package com.videoaulaneri.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.videoaulaneri.model.ProfessorModel;

@Path("/professores")
@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessoresFacade {
	static List<ProfessorModel> listaProfessores = new ArrayList<ProfessorModel>();
	
	static {
		listaProfessores.add(new ProfessorModel(1,"Neri Neitzke","videoaulaneri@gmail.com","(54)3329-5400"));
		listaProfessores.add(new ProfessorModel(2,"Valderi Neitzke","videoaulaneri@gmail.com","(54)3329-5400"));
		listaProfessores.add(new ProfessorModel(3,"Sidinei Neitzke","videoaulaneri@gmail.com","(54)3329-5400"));
	}
	
	@GET
	public List<ProfessorModel> getProfessores() {
		return listaProfessores;
	}
	
	@POST
	public ProfessorModel salvar(ProfessorModel professor) {
		System.out.println("salvar @POST");
		System.out.println("codigo="+professor.getCodigo());
		System.out.println("nome="+professor.getNome());
		System.out.println("Email="+professor.getEmail());
		System.out.println("Fone="+professor.getFone());
		return professor;
	}
	
	@PUT
	public void atualizar(ProfessorModel professor) {
		System.out.println("atualizar @PUT");
		System.out.println("codigo="+professor.getCodigo());
		System.out.println("nome="+professor.getNome());
		System.out.println("Email="+professor.getEmail());
		System.out.println("Fone="+professor.getFone());
		listaProfessores.remove(professor);
		listaProfessores.add(professor);
	}
	
	@DELETE
	@Path("/{codigoProfessor}")
	public void excluir(@PathParam("codigoProfessor") Integer codigoProfessor) {
		System.out.println("excluir @DELETE");
		ProfessorModel professor = new ProfessorModel();
		professor.setCodigo(codigoProfessor);
		listaProfessores.remove(professor);
	}
	
}
