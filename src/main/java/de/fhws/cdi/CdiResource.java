package de.fhws.cdi;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("cdi")
public class CdiResource {

    @Inject
    Event<String> event;

    @GET
    public String start(@QueryParam("number") int number) {
        System.out.println("start CDI");
        event.fireAsync("Hello From CDI");
        System.out.println("end cdi");
        return "result " + number *42;
    }
    
}
