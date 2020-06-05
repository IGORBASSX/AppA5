package com.example.appa5.activity;

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

        btnFuncionarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaMenuFuncionarios = new Intent(MenuActivity.this, MenuFuncionarioActivity.class);
                startActivity(irParaMenuFuncionarios);
            }
        });

        btnProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaMenuProdutos = new Intent(MenuActivity.this, MenuProdutosActivity.class);
                startActivity(irParaMenuProdutos);
            }
        });
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void acessarCadastroFuncionario(View view) {
        Intent intent = new Intent(this, ListaProdutosActivity.class);
        startActivity(intent);

    }
    public void acessarCadastroFornecedor(View view) {
        Intent intent = new Intent(this, ListaProdutosActivity.class);
        startActivity(intent);

    }

    public void sairDoMenu(View view){
        finish();
    }
}