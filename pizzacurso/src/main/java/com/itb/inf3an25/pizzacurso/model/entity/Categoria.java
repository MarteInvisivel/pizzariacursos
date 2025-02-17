package com.itb.inf3an25.pizzacurso.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "categorias")
@Data
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 100)
    private String descricao;
    private boolean codStatus;

    //ADA

    @Transient      // INFORMA Q O ATRIBUTO N E DA COLUNA AAH
    private String mensagemErro="";
    @Transient 
    private boolean isValid = true;

}
