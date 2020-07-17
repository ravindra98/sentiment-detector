package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.json.simple.JSONArray;

@Path("/sentiment")
//@RegisterRestClient
public class Gateway {

    @Inject
    DetectorClass service;

    @GET
    @Path("/sentence={sentence}")
    @Produces(MediaType.APPLICATION_JSON)
    public JSONArray greeting(@PathParam("sentence") String sentence) {
    //public JSONArray greeting(@QueryParam("name") String q,@QueryParam("sentence") String sentence) {
        return service.greeting(sentence);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testsconnection() {
        return "success";
    }
}