package com.alisson.biblioteca.controller;

import com.alisson.biblioteca.dto.AutorDto;
import com.alisson.biblioteca.entity.Autor;
import com.alisson.biblioteca.mapper.AutorMapper;
import com.alisson.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/autor")
public class AutorController {

    @Autowired
    AutorRepository autorRepository;

    @GetMapping
    public List<Autor> GetAutores(){
        return autorRepository.findAll();
    }

    @PostMapping(path = "/inserir")
    public Autor cadastrar(@RequestBody AutorDto autorDto){
        Autor autor = AutorMapper.paraAutor(autorDto);
        return autorRepository.save(autor);
    }
}
