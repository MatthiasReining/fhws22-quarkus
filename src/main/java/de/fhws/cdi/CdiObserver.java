package de.fhws.cdi;

import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;

public class CdiObserver {

    public void observe(@ObservesAsync String message) {
        System.out.println("observer: " + message);
    }
}
