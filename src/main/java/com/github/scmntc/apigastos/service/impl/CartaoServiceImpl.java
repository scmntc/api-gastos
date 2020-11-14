package com.github.scmntc.apigastos.service.impl;

import com.github.scmntc.apigastos.data.CartaoData;
import com.github.scmntc.apigastos.entities.Cartao;
import com.github.scmntc.apigastos.framework.CrudService;
import com.github.scmntc.apigastos.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author Otavio Soares
 */
@Service
public class CartaoServiceImpl extends CrudService<Cartao, Long> implements CartaoService {

    @Autowired private CartaoData data;

    @Override
    protected JpaRepository<Cartao, Long> data() {
        return data;
    }
}
