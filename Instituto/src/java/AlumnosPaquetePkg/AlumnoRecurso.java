/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnosPaquetePkg;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author lalvm
 */
public class AlumnoRecurso {

    private String id;

    /**
     * Creates a new instance of AlumnoRecurso
     */
    private AlumnoRecurso(String id) {
        this.id = id;
    }

    /**
     * Get instance of the AlumnoRecurso
     */
    public static AlumnoRecurso getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of AlumnoRecurso class.
        return new AlumnoRecurso(id);
    }

    /**
     * Retrieves representation of an instance of AlumnosPaquetePkg.AlumnoRecurso
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of AlumnoRecurso
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }

    /**
     * DELETE method for resource AlumnoRecurso
     */
    @DELETE
    public void delete() {
    }
}
