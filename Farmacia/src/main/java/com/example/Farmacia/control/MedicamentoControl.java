package com.example.Farmacia.control;

import com.example.Farmacia.model.Medicamento;
import com.example.Farmacia.view.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/apiFarmacia")
public class MedicamentoControl {
    @Autowired
    MedicamentoRepository mRepo;


    @GetMapping(value="/medicamentos")
    public List<Medicamento> listarMedicamentos()
    {
        return mRepo.findAll();
    }

    @GetMapping(value="/medicamentos/{codigo}")
    public Optional<Medicamento> FindID (@PathVariable int codigo) {return mRepo.findById(codigo);}

    @PostMapping(value="/inserir")
    public void InserirMedicamento (@RequestBody Medicamento m)
    {
        mRepo.save(m);
    }

    @DeleteMapping(value = "/delete")
    public void deletarAluno(@RequestBody Medicamento m)
    {
        mRepo.delete(m);
    }

    @DeleteMapping(value = "/deleteID/{codigo}")
    public void deletebyID(@PathVariable int codigo)
    {
        mRepo.deleteById(codigo);
    }

    @PutMapping(value = "update")
    private void AtualizarAluno(@RequestBody Medicamento m)
    {
        mRepo.save(m);
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Medicamento> buscarPorNome (@PathVariable String nome)
    { return mRepo.findByNome(nome); }

    @GetMapping("/buscar/laboratorio/{laboratorio}")
    public List<Medicamento> buscarporLab (@PathVariable String laboratorio)
    { return mRepo.findByLaboratorio(laboratorio); }

    @GetMapping("/buscar/preco/{preco}")
    public List<Medicamento> buscarPorAltura(@PathVariable double preco)
    {return mRepo.findByPreco(preco);}

    @GetMapping("/buscar/parte/{nome}")
    public List<Medicamento> FindByParteNome(@PathVariable String nome)
    {
        return mRepo.findByParteNome(nome);
    }
    @GetMapping("/buscar/maior/{codigo}")
    public List<Medicamento> findByMaiorCodigo(@PathVariable int codigo)
    {
        return mRepo.findByMaiorCodigo(codigo);
    }

    @GetMapping("/buscar/raNome/{codigo}/{nome}")
    public  List<Medicamento> findByCodigoNome(@PathVariable int codigo, @PathVariable String nome)
    {
        return mRepo.findByCodigoNome(codigo,nome);
    }

    @GetMapping("/buscar/maiorPreco/{preco}")
    public List<Medicamento> findByMaiorPreco(@PathVariable double preco){
        return mRepo.findByMaiorPreco(preco);
    }
}
