package ir.mapsa.clinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_department")
@Getter
@Setter
@NoArgsConstructor

public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "dep_id")
    private Long id;

    @Column(name="dep_description")
    private String description;

    @Column(name="dep_name")
    private String name;

    public Department(String name,String description){
        this.description=description;
        this.name=name;
    }
}
