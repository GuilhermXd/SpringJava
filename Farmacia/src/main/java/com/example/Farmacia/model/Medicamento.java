package com.example.Farmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Medicamento {

    // código, nome, dosagem (mg), preco, laboratório, receita obrigatória (sim/não)
    @Id
    private int codigo;

    @Column
    private String nome;
    @Column
    private String dosagem;
    @Column
    private double preco;
    @Column
    private String laboratorio;
    @Column(nullable = false)
    private boolean receita;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String lab) {
        this.laboratorio = lab;
    }

    public boolean isReceita() {
        return receita;
    }

    public void setReceita(boolean receita) {
        this.receita = receita;
    }
}
