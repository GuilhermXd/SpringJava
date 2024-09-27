package com.example.Livros.repository;

import com.example.Livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository <Livro, Integer> {
}
