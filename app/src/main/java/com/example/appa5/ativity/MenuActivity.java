package com.example.appa5.ativity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appa5.R;

public class MenuActivity extends AppCompatActivity {

    private Button btnProdutos, btnFuncionarios, btnFornecedores, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnProdutos = findViewById(R.id.btnProdutos);
        btnFuncionarios = findViewById(R.id.btnFuncionarios);
        btnFornecedores = findViewById(R.id.btnFornecedores);
        btnSair = findViewById(R.id.btnSairMenu);

        btnProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaMenuProdutos = new Intent(MenuActivity.this, MenuProdutosActivity.class);
                startActivity(irParaMenuProdutos);
            }
        });

        btnFuncionarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaMenuFuncionarios = new Intent(MenuActivity.this, MenuFuncionariosActivity.class);
                startActivity(irParaMenuFuncionarios);
            }
        });
        btnFornecedores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaMenuFornecedores = new Intent(MenuActivity.this, MenuFornecedorActivity.class);
                startActivity(irParaMenuFornecedores);
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