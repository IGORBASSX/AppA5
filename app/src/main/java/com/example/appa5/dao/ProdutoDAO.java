package com.example.appa5.dao;

import com.example.appa5.entity.Produto;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProdutoDAO {
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    public void salvarProduto(String nomeProduto, double valor, int quantidade){
                Produto produto = new Produto(nomeProduto, valor, quantidade);

                this.database = FirebaseDatabase.getInstance();
                databaseReference = database.getReference();
                databaseReference.child("produto").push().setValue(produto);
    }
}
