package application.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Data
@ToString
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TINYTEXT NOT NULL", unique = true)
    private String mnemonic;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String description;

    @Column(name = "impact_factor", nullable = false, columnDefinition = "TINYINT")
    private int impactFactor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Domain domain;

    @Column(columnDefinition = "NOT NULL")
    private String CMDBlink;

    @Column(name = "this_month_downtime_seconds", columnDefinition = "TIME NOT NULL")
    private LocalTime currentMonthDowntimeSEC;

    @Column(name = "platform_tz", columnDefinition = "VARCHAR(6) NOT NULL")
    private String platformTZ;

}
