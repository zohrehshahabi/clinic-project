package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.base.BaseDto;
import ir.mapsa.clinic.entity.enums.ERole;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class RoleDto {
    private Long id;
    @NotNull
    private ERole role;

}
