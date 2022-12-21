package ir.mapsa.clinic.base;

import ir.mapsa.clinic.exceptions.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;


public abstract class BaseRestController<D extends BaseDto,
        E extends BaseEntity,
        M extends BaseMapper<E, D>,
        S extends BaseService<E, ID>,
        ID extends Serializable> {

    protected final S service;
    protected final M mapper;

    public BaseRestController(S service, M mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<D> add(@Valid @RequestBody D d)throws BaseException{
        E e=mapper.convertDtoToEntity(d);
        return  ResponseEntity.ok(
                mapper.convertEntityToDto(
                        service.saveOrUpdate(e)
                )
        );
    }

    @PutMapping
    public ResponseEntity<D> update(@Valid @RequestBody D d)throws BaseException{
        E e=mapper.convertDtoToEntity(d);
        return  ResponseEntity.ok(
                mapper.convertEntityToDto(
                        service.saveOrUpdate(e)
                )
        );
    }
    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable ID id)throws BaseException {
        return ResponseEntity.ok(
                mapper.convertEntityToDto(
                        service.findById(id)
                )
        );
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ID id)throws BaseException{
        service.findById(id);
        service.deleteById(id);
    }
    @GetMapping
    public ResponseEntity<List<D>> findAll()throws BaseException{
     List<E> all  =service.findAll();
     all.forEach(item-> System.out.println(item));
     return ResponseEntity.ok(
             mapper.convertListEntityToListDto(all)
     );
    }
}
