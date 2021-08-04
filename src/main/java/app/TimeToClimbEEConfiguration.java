package app;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

public class TimeToClimbEEConfiguration extends Configuration {
    @NotEmpty
    private String defaultTailNumber = "N395EF";

    @JsonProperty
	public String getDefaultTailNumber() {
		return defaultTailNumber;
	}

    @JsonProperty
	public void setDefaultTailNumber(String defaultTailNumber) {
		this.defaultTailNumber = defaultTailNumber;
	}


}
