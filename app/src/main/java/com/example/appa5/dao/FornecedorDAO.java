package com.example.appa5.dao;

import com.example.appa5.entitie.Fornecedor;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FornecedorDAO {
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    public void salvarFornecedor(String nomeFornecedor, String telefoneFornecedor, String emailFornecedor){
        Fornecedor fornecedor = new Fornecedor(nomeFornecedor, telefoneFornecedor, emailFornecedor);

        this.database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference();
        databaseReference.child("fornecedor").push().setValue(fornecedor);
    }

}