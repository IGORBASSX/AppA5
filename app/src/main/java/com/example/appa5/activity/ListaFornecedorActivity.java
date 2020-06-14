package com.example.appa5.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appa5.R;
import com.example.appa5.entity.Fornecedor;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.List;

public class ListaFornecedorActivity extends AppCompatActivity {

    private ListView lvFornecedor;
    private List<Fornecedor> listaFornecedor;

    private FirebaseDatabase database;
    private DatabaseReference reference;
    private ChildEventListener childEventListener;
    private Query query;
    private ArrayAdapter<Fornecedor> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_fornecedor);

        lvFornecedor = findViewById(R.id.lvFornecedor);
        listaFornecedor = new ArrayList<>();
        adapter = new ArrayAdapter<>(ListaFornecedorActivity.this, android.R.layout.simple_list_item_1, listaFornecedor);
        lvFornecedor.setAdapter(adapter);

        FloatingActionButton fbSair = findViewById(R.id.fButtonSairFornecedores);

        fbSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        listaFornecedor.clear();
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();
        query = reference.child("fornecedor").orderByChild("nome");

        childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String nome = dataSnapshot.child("nomeFornecedor").getValue(String.class);
                String telefone = dataSnapshot.child("telefoneFornecedor").getValue(String.class);
                String email = dataSnapshot.child("emailFornecedor").getValue(String.class);

                Fornecedor fornecedor = new Fornecedor(nome, telefone, email);

                listaFornecedor.add(fornecedor);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };

        query.addChildEventListener(childEventListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        query.removeEventListener(childEventListener);
    }

}
