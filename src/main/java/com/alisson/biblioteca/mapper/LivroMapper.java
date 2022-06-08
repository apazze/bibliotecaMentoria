package com.alisson.biblioteca.mapper;

import com.alisson.biblioteca.dto.LivroDto;
import com.alisson.biblioteca.entity.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroMapper {

    public static Livro paraLivro(LivroDto livroDto){
        Livro livro = new Livro();
        livro.setIsbn(livroDto.getIsbn());
        livro.setTitulo(livroDto.getTitulo());
        livro.setAutor(livroDto.getAutor());
        return livro;
    }

    public static List<Livro> paraListaDeLivros(List<LivroDto> publicacoes) {
        List<Livro> lista = new ArrayList<>();
        for (LivroDto livroDto:
             publicacoes) {
            Livro livro = new Livro();
            livro.setTitulo(livroDto.getTitulo());
            livro.setIsbn(livroDto.getIsbn());
            livro.setAutor(livroDto.getAutor());
            lista.add(livro);
        }
        return lista;
    }
}
