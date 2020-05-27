package com.example.appa5.ativity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appa5.R;

public class MenuFornecedorActivity extends AppCompatActivity {
    private Button btnSair, btnCadastrarFornecedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fornecedores);

        btnCadastrarFornecedor = findViewById(R.id.btnCadastrarFornecedor);
        btnSair = findViewById(R.id.btnSairMenuFornecedor);

        btnCadastrarFornecedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaCadastroFornecedor = new Intent(MenuFornecedorActivity.this, MenuFornecedorActivity.class);
                startActivity(irParaCadastroFornecedor);
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