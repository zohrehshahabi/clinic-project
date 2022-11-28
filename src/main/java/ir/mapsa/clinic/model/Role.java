package ir.mapsa.clinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_role")
@Getter
@Setter
@NoArgsConstructor

public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name="role_name")
    private String Title;

    public Role(String title) {
        Title = title;
    }
}
