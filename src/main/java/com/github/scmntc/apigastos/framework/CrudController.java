package com.github.scmntc.apigastos.framework;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

public abstract class CrudController<T, ID extends Serializable> implements ICrudController<T, ID> {

    protected abstract ICrudService<T, ID> service();

    @Override
    @PostMapping
    public T save(@RequestBody T entity) {
        return service().save(entity);
    }

    @Override
    @RequestMapping(params = {"id"}, method = RequestMethod.GET)
    public T findById(@RequestParam("id") ID id) {
        return service().findById(id);
    }

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public List<T> findAll() {
        return service().findAll();
    }

    @Override
    @DeleteMapping
    public void delete(@RequestParam("id") ID id) { service().deleteById(id); }
}
