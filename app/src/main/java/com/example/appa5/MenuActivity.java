package com.example.appa5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    //private Button btnCadastroFuncionarios, btnCadastroProdutos, btnCadastroFornecedores, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void acessarCadastroProdutos(View view) {
        Intent intent = new Intent(this, ListaProdutosActivity.class);
        startActivity(intent);

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