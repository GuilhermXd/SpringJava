package com.example.demoTania1.controller;


import com.example.demoTania1.model.Aluno;
import com.example.demoTania1.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;


    @GetMapping("/todos")
    public List<Aluno> listarAlunos()
    {
        return alRepo.findAll();
    }





}
