package com.example.appa5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText etLogin, etSenha;
    private Button btnLogin, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLogin = findViewById(R.id.etLogin);
        etSenha = findViewById(R.id.etSenha);
        btnLogin = findViewById(R.id.btnLogin);
        btnSair = findViewById(R.id.btnLSair);

        btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Comportamento do botão Login
        }
    });

        btnSair.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Comportamento do botão Sair
            finish();
        }
    });

}



}
