package com.github.scmntc.apigastos.entities;

import com.github.scmntc.apigastos.entities.enums.TipoCartaoEnum;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Otavio Soares
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "cartao")
@EqualsAndHashCode(of = "idcartao")
public class Cartao implements Serializable {

    @Id
    @Column(name = "idcartao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcartao;

    @Column(name = "nome", length = 255, nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoCartaoEnum tipo;

    @Column(name = "limite", nullable = false)
    private BigDecimal limite;

    @Column(name = "numerofinal", nullable = false)
    private String numeroFinal;

}
