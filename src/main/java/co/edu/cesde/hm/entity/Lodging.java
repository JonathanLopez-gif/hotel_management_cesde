package co.edu.cesde.hm.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "lodgings")
@Getter
@RequiredArgsConstructor
public class Lodging {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lodging_id")
    private Integer id;

    @NotBlank
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer", nullable = false)
    private Customer customer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room", nullable = false)
    private Room room;

    @NotBlank
    @Column(name = "check_in_datetime", nullable = false)
    private LocalDateTime checkInDateTime;

    @NotBlank
    @Column(name = "check_out_datetime", nullable = false)
    private LocalDateTime checkOutDateTime;

    @NotBlank
    @Column(name = "active", nullable = false)
    private Boolean active;

    @CreationTimestamp
    @Column(name = "creation", nullable = false)
    private LocalDate creationDate;
}
