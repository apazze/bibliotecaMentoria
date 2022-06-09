package com.alisson.biblioteca.mapper;

import com.alisson.biblioteca.dto.AutorDto;
import com.alisson.biblioteca.entity.Autor;

public class AutorMapper {

    public static Autor paraAutor(AutorDto autorDto) {
        return new Autor(autorDto.getNome(), LivroMapper.paraListaDeLivros(autorDto.getPublicacoes()));
    }
}
