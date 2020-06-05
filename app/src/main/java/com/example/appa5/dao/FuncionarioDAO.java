package com.example.appa5.dao;

import com.example.appa5.entity.Funcionario;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FuncionarioDAO {

    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    public void salvarFuncionario(String nomeFuncionario, String cpf, String setor){
        Funcionario funcionario = new Funcionario(nomeFuncionario,cpf,setor);
        this.database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference();
        databaseReference.child("funcionario").push().setValue(funcionario);
    }
}
