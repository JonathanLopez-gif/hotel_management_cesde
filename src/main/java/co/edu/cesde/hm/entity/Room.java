package co.edu.cesde.hm.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "rooms")
@Getter
@RequiredArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Integer id;

    @NotNull
    @Column(name = "number_room", nullable = false)
    private Integer numberRoom;

    @NotNull
    @Column(name = "floor", nullable = false)
    private Integer floor;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_room", nullable = false)
    private TypeRoom typeRoom;

    @NotNull
    @Column(name = "night_value", nullable = false)
    private BigDecimal nightValue;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_room", nullable = false)
    private StatusRoom statusRoom;
}
