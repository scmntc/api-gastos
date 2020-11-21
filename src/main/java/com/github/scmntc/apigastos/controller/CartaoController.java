package com.github.scmntc.apigastos.controller;

import com.github.scmntc.apigastos.entities.Cartao;
import com.github.scmntc.apigastos.entities.enums.TipoCartaoEnum;
import com.github.scmntc.apigastos.framework.ICrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Otavio Soares
 */
@RestController(value = "api/cartao")
public interface CartaoController extends ICrudController<Cartao, Long> {

    @GetMapping("find-all-tipos")
    ResponseEntity<TipoCartaoEnum> findAllTiposCartao();
}
