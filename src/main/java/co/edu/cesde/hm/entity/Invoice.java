package co.edu.cesde.hm.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
@Getter
@RequiredArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Integer id;

    @NotBlank
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lod", nullable = false, unique = true)
    private Lodging lodging;

    @NotBlank
    @Column(name = "generation_date", nullable = false)
    private LocalDate generationDate;

    @NotNull
    @Column(name = "amount_nights", nullable = false)
    private Integer amountNights;

    @NotNull
    @Column(name = "night_value", nullable = false)
    private BigDecimal nightValue;

    @NotNull
    @Column(name = "total_value", nullable = false)
    private BigDecimal totalValue;
}
