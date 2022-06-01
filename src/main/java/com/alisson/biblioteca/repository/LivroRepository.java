package com.alisson.biblioteca.repository;

import com.alisson.biblioteca.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long>{
    Livro findByIsbn(String isbn);
}
