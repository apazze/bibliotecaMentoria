package com.alisson.biblioteca.entity;

import javax.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;

    public Livro(String isbn, String titulo, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro() {
    }

    private String titulo;
    @ManyToOne(cascade = CascadeType.PERSIST)
    Autor autor;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: ["+ this.id+"] Isbn: ["+this.isbn+"] Titulo: ["+this.titulo+"] Autor: ["+this.autor.getNome()+"]";
    }
}
