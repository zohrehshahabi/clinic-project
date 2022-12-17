package ir.mapsa.clinic.entity;


import ir.mapsa.clinic.base.BaseEntity;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "dep_id")
    private Long id;


    @Column(name="dep_description")
    private String description;

    @Column(name="dep_name")
    private String name;


}
