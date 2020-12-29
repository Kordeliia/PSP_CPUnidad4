/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnosPaquetePkg;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author lalvm
 */
@Path("/ps")
public class AlumnosRecursos {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AlumnosRecursos
     */
    public AlumnosRecursos() {
    }

    /**
     * Retrieves representation of an instance of AlumnosPaquetePkg.AlumnosRecursos
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public Alumno getXml() {
        return new Alumno(1, "Laura Alvarez", 2);
    }
@POST
public Response postXml(String content)
{
 System.out.println("por aqui");
 return Response.ok().build();
}

@Path("{id}")
public String getAlumnoRecurso(@PathParam("id") String id) {
 System.out.println("reclamamos elemento");
 return "Complicando los mappings";
}
}
