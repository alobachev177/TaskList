package application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "short_name", nullable = false, unique = true)
    private String shortName;

    @Column(nullable = false)
    private String description;

    @JsonIgnore
    @Column(nullable = false)
    private double rating;

}
