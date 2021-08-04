package app.health;

import com.codahale.metrics.health.HealthCheck;

public class AircraftHealthCheck extends HealthCheck {
    private final String defaultTailNumber;

    public AircraftHealthCheck(String defaultTailNumber) {
        this.defaultTailNumber = defaultTailNumber;
    }

    // TODO: This is a really bad example, there isn't anything much to health check yet.
    @Override
    protected Result check() throws Exception {
        if (null == defaultTailNumber) {
            return Result.unhealthy("The default tail number isn't set.");
        }
        return Result.healthy();
    }
}