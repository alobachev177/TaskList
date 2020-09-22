package responseDTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DomainDTO {
    @JsonProperty(value = "domain_name")
    private String shortName;

    @JsonProperty(value = "domain_rating")
    private double rating;
}
