package com.example.appa5.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appa5.R;

public class MenuFuncionarioActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_funcionario);

        Button btnCadastrarFuncionario = findViewById(R.id.btnCadastrarFuncionario);
        Button btnListarFunc = findViewById(R.id.btnListarFunc);
        Button btnSair = findViewById(R.id.btnSairMenuFunc);

        btnCadastrarFuncionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irParaCadastroFuncionario = new Intent(MenuFuncionarioActivity.this, CadastroFuncionarioActivity.class);
                startActivity(irParaCadastroFuncionario);
            }
        });

        btnListarFunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaListaFunc = new Intent(MenuFuncionarioActivity.this, ListaFuncionarioActivity.class);
                startActivity(irParaListaFunc);

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
