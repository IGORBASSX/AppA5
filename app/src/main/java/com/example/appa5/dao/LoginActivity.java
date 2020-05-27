package com.example.appa5.dao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appa5.R;

public class LoginActivity extends AppCompatActivity {

    private EditText etLogin, etSenha;
    private Button btnLogin, btnSair, btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLogin = findViewById(R.id.etLogin);
        etSenha = findViewById(R.id.etSenha);

        btnLogin = findViewById(R.id.btnLogin);
        btnSair = findViewById(R.id.btnSair);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Comportamento do botão Login
                Intent menu = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(menu);
            }

        });
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CadastroAdmin.class);
                startActivity(intent);
            }
        });

//        btnSair.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
////            //Comportamento do botão Sair
////            finish();
// }
    }

}
