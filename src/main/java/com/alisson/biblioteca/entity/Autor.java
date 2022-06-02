package com.alisson.biblioteca.entity;

import javax.persistence.*;
import java.util.List;
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Livro> publicacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Livro> publicacoes) {
        this.publicacoes = publicacoes;
    }
}
