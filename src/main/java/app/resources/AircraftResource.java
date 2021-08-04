package app.resources;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

import app.api.Aircraft;

@Path("/aircraft")
@Produces(MediaType.APPLICATION_JSON)
public class AircraftResource {
    private final String defaultTailNumber;

    public AircraftResource(String defaultTailNumber) {
        this.defaultTailNumber = defaultTailNumber;
    }

    @GET
    @Timed
    public Aircraft getAircraftInfo(@QueryParam("tailNumber") Optional<String> tailNumber) {
    	final String value = tailNumber.orElse(defaultTailNumber);
        return new Aircraft(value);
    }
}
