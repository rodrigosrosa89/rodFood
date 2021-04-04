package com.rodrigo.rodfood.rodfood.model;

import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Entity
public class Pedido {

    private BigDecimal subTotal;
    private BigDecimal taxaFrete;
    private BigDecimal valorTotal;
    private OffsetDateTime dataCriacao;
    private OffsetDateTime dataConfirmacao;
    private OffsetDateTime dataCancelamento;
    private OffsetDateTime dataEntrega;
}
