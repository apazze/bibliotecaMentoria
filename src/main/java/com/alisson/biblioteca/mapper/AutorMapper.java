package com.alisson.biblioteca.mapper;

import com.alisson.biblioteca.dto.AutorDto;
import com.alisson.biblioteca.entity.Autor;

public class AutorMapper {


    public static Autor paraAutor(AutorDto autorDto) {
        Autor autor = new Autor();
        autor.setNome(autorDto.getNome());
        autor.setPublicacoes(LivroMapper.paraListaDeLivros(autorDto.getPublicacoes()));
        return autor;
    }
}
