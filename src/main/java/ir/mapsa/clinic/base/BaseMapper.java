package ir.mapsa.clinic.base;

import java.util.List;

public interface BaseMapper<T extends BaseEntity, D extends BaseDto> {
    T convertDtoToEntity(D d);

    D convertEntityToDto(T t);

    List<T> convertListDtoToListEntity(List<D> dList);

    List<D> convertListEntityToListDto(List<T> tList);

}
