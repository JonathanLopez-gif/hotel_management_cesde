package co.edu.cesde.hm.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
@Getter
@RequiredArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer id;

    @NotNull
    @Column(name = "identification", nullable = false)
    private Integer identification;

    @NotBlank
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Email
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "phone",  nullable = false)
    private String phone;

    @CreationTimestamp
    @Column(name = "creation_date", nullable = false)
    private LocalDate creationDate;
}
