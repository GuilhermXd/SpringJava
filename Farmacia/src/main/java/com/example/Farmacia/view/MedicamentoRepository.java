package com.example.Farmacia.view;

import com.example.Farmacia.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicamentoRepository extends JpaRepository <Medicamento, Integer> {
    public List<Medicamento> findByNome(String nome);
    public List<Medicamento> findByLaboratorio(String laboratorio);
    public List<Medicamento> findByPreco(double preco);

    @Query("select a from Medicamento a where a.nome like %?1%")
    public List<Medicamento> findByParteNome(String nome);

    @Query("select a from Medicamento a where a.codigo >= ?1")
    public List<Medicamento> findByMaiorCodigo(int codigo);

    @Query("select a from Medicamento a where a.codigo > ?1 and a.nome like %?2%")
    public List<Medicamento> findByCodigoNome(int ra, String nome);

    @Query("select a from Medicamento a where a.preco > ?1")
    List<Medicamento> findByMaiorPreco(double preco);
}
