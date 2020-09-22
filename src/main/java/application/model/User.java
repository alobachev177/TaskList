package application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @JsonIgnore
    @Column(nullable = false)
    private boolean admin;

    @JsonIgnore
    @Column(nullable = false)
    private double rating;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Domain domain;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Organization organization;

    @Column(name = "phone_no", nullable = false, columnDefinition = "VARCHAR(16)")
    private String phoneNo;
}
