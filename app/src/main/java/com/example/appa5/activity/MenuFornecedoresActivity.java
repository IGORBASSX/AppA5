package com.example.appa5.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appa5.R;

public class MenuFornecedoresActivity extends AppCompatActivity {
    private Button btnSair, btnCadastrarFornecedor, btnListar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fornecedores);

        btnCadastrarFornecedor = findViewById(R.id.btnCadastrarFornecedor);

        btnSair = findViewById(R.id.btnSairMenuFornecedor);

        btnListar = findViewById(R.id.btnListarFornecedor);

        btnCadastrarFornecedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaCadastroFornecedor = new Intent(MenuFornecedoresActivity.this, CadastroFornecedorActivity.class);
                startActivity(irParaCadastroFornecedor);
            }
        });
        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaLista = new Intent(MenuFornecedoresActivity.this, ListaFornecedorActivity.class);
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