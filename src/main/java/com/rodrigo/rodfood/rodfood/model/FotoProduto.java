package com.rodrigo.rodfood.rodfood.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class FotoProduto {

    private String nomeArquivo;
    private String descricao;
    private String contentType;
    private long tamanho;
}
