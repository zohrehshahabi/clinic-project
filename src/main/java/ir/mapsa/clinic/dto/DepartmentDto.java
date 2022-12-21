package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.base.BaseDto;
import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DepartmentDto extends BaseDto {
    private Long id;

    private String description;

    private String name;
}
