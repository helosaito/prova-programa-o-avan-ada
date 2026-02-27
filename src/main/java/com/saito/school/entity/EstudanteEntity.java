package com.saito.school.entity;

import jakarta.persistence.*;

@Entity (name = "EstidanteEntity")
@Table (name = "tb_aluno")

public class EstudanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "nm-Estudante")
    private String nome;
    private String email;

    @Column (name = "em-Estudante")
    private Integer idade;

    public EstudanteEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
