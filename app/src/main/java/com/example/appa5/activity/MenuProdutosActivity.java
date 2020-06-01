package com.example.appa5.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appa5.R;

public class MenuProdutosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_produtos);

        Button btnCadastrarProduto = findViewById(R.id.btnCadastrarProduto);
        Button btnListar = findViewById(R.id.btnListarProd);
        Button btnSair = findViewById(R.id.btnSairMenuProd);

        btnCadastrarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaCadastroProduto = new Intent(MenuProdutosActivity.this, CadastroProdutoActivity.class);
                startActivity(irParaCadastroProduto);
            }
        });

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaLista = new Intent(MenuProdutosActivity.this, ListaProdutosActivity.class);
                startActivity(irParaLista);
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
