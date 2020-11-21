package com.github.scmntc.apigastos.controller.impl;

import com.github.scmntc.apigastos.controller.CartaoController;
import com.github.scmntc.apigastos.entities.Cartao;
import com.github.scmntc.apigastos.entities.enums.TipoCartaoEnum;
import com.github.scmntc.apigastos.framework.CrudController;
import com.github.scmntc.apigastos.framework.ICrudService;
import com.github.scmntc.apigastos.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Otavio Soares
 */

@RestController
@CrossOrigin
@RequestMapping(value = "api/cartao")
public class CartaoControllerImpl extends CrudController<Cartao, Long> implements CartaoController {

    @Autowired private CartaoService service;

    @Override
    protected ICrudService<Cartao, Long> service() {
        return service;
    }

    @Override
    @GetMapping("find-all-tipos")
    public ResponseEntity<TipoCartaoEnum> findAllTiposCartao() {
        return new ResponseEntity(TipoCartaoEnum.values(), HttpStatus.OK);
    }
}
