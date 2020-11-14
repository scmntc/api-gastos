package com.github.scmntc.apigastos.framework;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.List;

public interface ICrudController<T, ID extends Serializable> {

    T save(T entity);

    T findById(ID id);

    List<T> findAll();

    void delete(@RequestParam("id") ID id);
}
