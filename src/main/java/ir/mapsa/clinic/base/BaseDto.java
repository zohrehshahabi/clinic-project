package ir.mapsa.clinic.base;

import lombok.*;

import java.util.Date;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class BaseDto {
    private Date createdDate;
    private Date lastModifiedDate;
}
