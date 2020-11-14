package com.github.scmntc.apigastos.data;

import com.github.scmntc.apigastos.entities.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Otavio Soares
 */
public interface CartaoData extends JpaRepository<Cartao, Long> {
}
