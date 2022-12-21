package ir.mapsa.clinic.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import ir.mapsa.clinic.entity.enums.ERole;
import lombok.*;

@Entity
@Table(name = "roles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole role;



}
