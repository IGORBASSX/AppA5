package com.example.appa5.entity;

import androidx.annotation.NonNull;

public class Funcionario {

    //CLasse Funcionario

    private String nomeFuncionario;
    private String cpf;
    private String setor;

    public Funcionario(String nomeFuncionario, String cpf, String setor) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpf = cpf;
        this.setor = setor;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome: " + nomeFuncionario + "   CPF: " + cpf + "     Setor: " + setor;
    }
}
