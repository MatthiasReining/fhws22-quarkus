package de.fhws.cdi;

import java.util.logging.Logger;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("cdi")
public class CdiResource {

    private static Logger LOG = Logger.getLogger(CdiResource.class.getName());

    @Inject
    Event<String> event;

    @GET
    public String start(@QueryParam("number") int number) {
        LOG.info("CDI Start: " + number);
        System.out.println("start CDI");
        event.fireAsync("Hello From CDI");
        System.out.println("end cdi");
        return "result " + number * 42;
    }

}
