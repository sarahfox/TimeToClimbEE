package app;

import app.health.AircraftHealthCheck;
import app.resources.AircraftResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TimeToClimbEEApplication extends Application<TimeToClimbEEConfiguration> {

    public static void main(final String[] args) throws Exception {
        if (args.length < 2) {
            new TimeToClimbEEApplication().run(new String[]{"server", "config.yml"});
        } else {
            new TimeToClimbEEApplication().run(args);
        }
    }

    @Override
    public String getName() {
        return "TimeToClimbEE";
    }

    @Override
    public void initialize(final Bootstrap<TimeToClimbEEConfiguration> bootstrap) {
    	bootstrap.addBundle(new AssetsBundle("/assets/", "/"));
    }

    @Override
    public void run(final TimeToClimbEEConfiguration configuration,
                    final Environment environment) {
    	final AircraftResource resource = new AircraftResource(
    	        configuration.getDefaultTailNumber()
    	    );
	    environment.jersey().register(resource);
	    
	    final AircraftHealthCheck healthCheck =
	            new AircraftHealthCheck(configuration.getDefaultTailNumber());
        environment.healthChecks().register("aircraft", healthCheck);
    }

}
