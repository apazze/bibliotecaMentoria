package com.alisson.biblioteca.repository;

import com.alisson.biblioteca.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
