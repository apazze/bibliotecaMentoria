package com.alisson.biblioteca.dto;

import java.util.List;

public class AutorDto {
    private String nome;
    private List<LivroDto> publicacoes;

    public AutorDto(String nome, List<LivroDto> publicacoes) {
        this.nome = nome;
        this.publicacoes = publicacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<LivroDto> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<LivroDto> publicacoes) {
        this.publicacoes = publicacoes;
    }
}
