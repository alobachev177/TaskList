package application.model;

import lombok.Data;
import lombok.ToString;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@ToString
public class Impact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "main_incident", nullable = false, unique = true)
    private int mainIncident;

    @Column(name = "fin_value")
    private double finValue;

    @Column(name = "sub_amount")
    private int subAmount;


}
