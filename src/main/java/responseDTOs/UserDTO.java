package responseDTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserDTO {
    @JsonProperty(value = "user_name")
    private String name;
    @JsonProperty(value = "user_domain")
    private String domainName;
}
