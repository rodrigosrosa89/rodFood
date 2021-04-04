package com.rodrigo.rodfood.rodfood.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Entity
public class Restaurante {

    private String nome;
    private BigDecimal taxaFrete;
    private boolean ativo;
    private boolean aberto;
    private OffsetDateTime dataCadastro;
    private OffsetDateTime dataAtualizacao;
}
