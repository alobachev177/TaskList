package application.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Platform platform;

    @Column(name = "start_local_date_time_plan", columnDefinition = "DATETIME NOT NULL")
    private LocalDateTime startLocalDateTimePlan;

    @Column(name = "start_local_date_time_actual", columnDefinition = "DATETIME")
    private LocalDateTime startLocalDateTimeActual;

    @Column(name = "stop_local_date_time_plan", columnDefinition = "DATETIME NOT NULL")
    private LocalDateTime stopLocalDateTimePlan;

    @Column(name = "stop_local_date_time_actual", columnDefinition = "DATETIME")
    private LocalDateTime stopLocalDateTimeActual;

    @Column(name = "created_when_MSK", columnDefinition = "DATETIME NOT NULL")
    private LocalDateTime createdWhenMSK;

    @Column(name = "created_by", nullable = false)
    private User createdBy;

    @Column(name = "updated_when_MSK", columnDefinition = "DATETIME NOT NULL")
    private LocalDateTime updatedWhenMSK;

    @Column(name = "updated_by")
    private User updatedBy;

    @Column(name = "task_complexity")
    private int complexity;

    @Column(name = "concurrent_task_id")
    private int concurrentTaskId;

    @Column(name = "impact")
    private Impact impact;
 }
