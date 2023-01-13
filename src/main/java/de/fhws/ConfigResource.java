package de.fhws;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("config")
public class ConfigResource {

    @Inject
    @ConfigProperty(name = "message")
    private String message ;

    @GET
    public String getConfig() {

        return message;

    }
    
}
