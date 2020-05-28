package com.example.appa5.ativity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appa5.R;
import com.example.appa5.entity.Produto;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {

    private ListView lvProduto;
    private List<Produto> listaProdutos;

    private FirebaseDatabase database;
    private DatabaseReference reference;
    private ChildEventListener childEventListener;
    private Query query;
    private ArrayAdapter<Produto> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produtos);

        lvProduto = findViewById(R.id.lvProdutos);
        listaProdutos = new ArrayList<>();
        adapter = new ArrayAdapter<>(ListaProdutosActivity.this, android.R.layout.simple_list_item_1, listaProdutos);
        lvProduto.setAdapter(adapter);

    }
    @Override
    protected void onStart() {
        super.onStart();

        listaProdutos.clear();
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();
        query = reference.child("produto").orderByChild("quantidade");

        childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String nome = dataSnapshot.child("nomeProduto").getValue(String.class);
                Double valor = dataSnapshot.child("valor").getValue(Double.class);
                int quantidade = dataSnapshot.child("quantidade").getValue(Integer.class);

                Produto produto = new Produto(nome, valor, quantidade);

                listaProdutos.add(produto);
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
