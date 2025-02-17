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
@Table(name = "produtos")
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false, length = 100)
    private String nome;
    @Column (nullable = true, length = 255)
    private String descricao;
    @Column (nullable = true, length = 45)
    private String tipo;
    @Column (nullable = true)
    private int quantidadeEstoque;
    @Column (nullable = false, columnDefinition = "DECIMAL(5,2)")
    private double precoVenda;
    @Column (nullable = false, columnDefinition = "DECIMAL(5,2)")
    private double precoCompra;
    private boolean codStatus;

    //ADA

    @Transient      // INFORMA Q O ATRIBUTO N E DA COLUNA AAH
    private String mensagemErro="";
    @Transient 
    private boolean isValid = true;
}
