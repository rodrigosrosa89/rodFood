package com.rodrigo.rodfood.rodfood.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.OffsetDateTime;

@Data
@Entity
public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private OffsetDateTime dataCadastro;
}
