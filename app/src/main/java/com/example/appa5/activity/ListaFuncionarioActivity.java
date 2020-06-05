package com.example.appa5.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appa5.R;
import com.example.appa5.entity.Funcionario;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.List;

public class ListaFuncionarioActivity extends AppCompatActivity {

    private ListView lvFuncionario;
    private List<Funcionario> listaFuncionario;

    private FirebaseDatabase database;
    private DatabaseReference reference;
    private ChildEventListener childEventListener;
    private Query query;
    private ArrayAdapter<Funcionario> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produtos);

        lvFuncionario = findViewById(R.id.lvProdutos);
        listaFuncionario = new ArrayList<>();
        adapter = new ArrayAdapter<>(ListaFuncionarioActivity.this, android.R.layout.simple_list_item_1, listaFuncionario);
        lvFuncionario.setAdapter(adapter);

    }
    @Override
    protected void onStart() {
        super.onStart();

        listaFuncionario.clear();
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();
        query = reference.child("funcionario").orderByChild("cpf");

        childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String nome = dataSnapshot.child("nomeFuncionario").getValue(String.class);
                String cpf = dataSnapshot.child("cpf").getValue(String.class);
                String setor = dataSnapshot.child("setor").getValue(String.class);

                Funcionario funcionario = new Funcionario(nome, cpf, setor);

                listaFuncionario.add(funcionario);
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