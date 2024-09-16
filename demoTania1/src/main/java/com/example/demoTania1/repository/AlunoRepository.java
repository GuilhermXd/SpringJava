package com.example.demoTania1.repository;

import com.example.demoTania1.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {
}
