package responseDTOs;

import application.model.Domain;
import application.model.Platform;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlatformDTO extends Platform {
    @JsonProperty(value = "platform_mnemonic")
    private String mnemonic;

    @JsonProperty(value = "platform_description")
    private String description;

    @JsonProperty(value = "platform_domain")
    private Domain domain;
}
