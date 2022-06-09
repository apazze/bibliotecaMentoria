package com.alisson.biblioteca.controller;

import com.alisson.biblioteca.dto.AutorDto;
import com.alisson.biblioteca.dto.LivroDto;
import com.alisson.biblioteca.entity.Autor;
import com.alisson.biblioteca.repository.AutorRepository;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
class AutorControllerTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private AutorRepository autorRepository;

    @Test
    void deveInserirLivro() throws Exception {

        AutorDto autorDto = new AutorDto("Autor1",
                List.of(new LivroDto("123456", "titulo1"), new LivroDto("789456", "titulo2")));

        this.mvc.perform(post("/livro/inserir").contentType(MediaType.APPLICATION_JSON)
                .content(toJson(autorDto)))
                .andExpect(status().isOk());

        Assert.assertEquals(1L, autorRepository.findAll().size());

        /*Autor autor = new Autor();
        autor.setNome("nomeAutor1");

        autorRepository.save(autor);
        Assert.assertEquals(1L, autorRepository.findAll().size());*/
    }

    private String toJson(AutorDto autorDto) {
        Gson g = new Gson();
        String json = g.toJson(autorDto);
        return json;
    }

}