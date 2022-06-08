package com.alisson.biblioteca.controller;

import com.alisson.biblioteca.dto.LivroDto;
import com.alisson.biblioteca.entity.Livro;
import com.alisson.biblioteca.mapper.LivroMapper;
import com.alisson.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livro")
public class LivroController {

    @Autowired
    LivroRepository livroRepository;

    @GetMapping
    public List<Livro>GetLivros(){
        return livroRepository.findAll();
    }
    @PostMapping(path = "/inserir")
    public Livro PostLivro(@RequestBody LivroDto livroDto){
        Livro livro = LivroMapper.paraLivro(livroDto);
        return livroRepository.save(livro);
    }
    @GetMapping("/{isbn}")
    public Livro GetLivroByIsbn(@PathVariable("isbn") String isbn){
        return livroRepository.findByIsbn(isbn);
    }
}
