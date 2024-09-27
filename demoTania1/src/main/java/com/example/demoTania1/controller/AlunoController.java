package com.example.demoTania1.controller;


import com.example.demoTania1.model.Aluno;
import com.example.demoTania1.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/apiAlunoo")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;


    @GetMapping(value="/alunos")
    public List<Aluno> listarAlunos()
    {
        return alRepo.findAll();
    }

    @GetMapping(value="/alunos/{ra}")
    public Optional<Aluno> FindID (@PathVariable(value = "ra")int ra)
    {
        return alRepo.findById(ra);
    }

    @PostMapping(value="/inserir")
    public void InserirAluno (@RequestBody Aluno al)
    {
        alRepo.save(al);
    }

    @DeleteMapping(value = "/delete")
    public void deletarAluno(@RequestBody Aluno al)
    {
        alRepo.delete(al);
    }

    @DeleteMapping(value = "/deleteID/{ra}")
    public void deletebyID(@PathVariable(value = "ra")int ra)
    {
        alRepo.deleteById(ra);
    }

    @PutMapping(value = "update")
    private void AtualizarAluno(@RequestBody Aluno al)
    {
        alRepo.save(al);
    }
}
