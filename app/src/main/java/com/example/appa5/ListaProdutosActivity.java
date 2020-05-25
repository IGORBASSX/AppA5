package com.example.appa5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaProdutosActivity extends AppCompatActivity {

    private ListView lvProdutos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produtos);

        lvProdutos = findViewById(R.id.lvProdutos);
        ArrayList produtos = new ArrayList();


    }
}