package com.example.Livros.controller;

import com.example.Livros.model.Livro;
import com.example.Livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/apiLivro")
public class LivroController {

    @Autowired
    LivroRepository lvRepo;

    @GetMapping(value = "/todos")
    public List<Livro> ListarLivros ()
    {
        return lvRepo.findAll();
    }

    @GetMapping(value = "/aluno/{codigo}")
    public Optional<Livro> BuscarLivro (@PathVariable(value = "codigo")int codigo)
    {
        return lvRepo.findById(codigo);
    }

    @PostMapping(value = "/inserir")
    public void inserir(@RequestBody Livro lv)
    {
        lvRepo.save(lv);
    }

    @DeleteMapping(value = "/deletar")
    public void deleta(@RequestBody Livro lv)
    {
        lvRepo.delete(lv);
    }

    @DeleteMapping(value = "/deletarID/{codigo}")
    public void deletarID (@PathVariable(value="codigo")int codigo)
    {
        lvRepo.deleteById(codigo);
    }

    @PutMapping(value = "/atualizar")
    public void atualiza (@RequestBody Livro lv)
    {
        lvRepo.save(lv);
    }
}
