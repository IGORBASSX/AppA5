package com.example.appa5.ativity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appa5.R;

public class MenuFuncionariosActivity extends AppCompatActivity {
    private Button btnSair, btnCadastrarFuncionario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_funcionarios);

        btnCadastrarFuncionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaCadastroFuncionario = new Intent(MenuFuncionariosActivity.this, MenuFuncionariosActivity.class);
                startActivity(irParaCadastroFuncionario);
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
