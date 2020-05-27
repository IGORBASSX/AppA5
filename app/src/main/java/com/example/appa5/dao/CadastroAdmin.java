package com.example.appa5.dao;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appa5.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class CadastroAdmin extends AppCompatActivity {
    EditText etLogin, etSenha;

    private FirebaseAuth auth;
    private FirebaseUser usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_admin);

        etLogin = findViewById(R.id.etLoginCad);
        etSenha = findViewById(R.id.etSenhaCad);

        Button btnCadastrar = findViewById(R.id.btnCadastrarCad);

        auth = FirebaseAuth.getInstance();

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrar();
            }
        });
    }
    private void cadastrar(){
        String email = etLogin.getText().toString();
        String senha = etSenha.getText().toString();
        if( !email.isEmpty() && !senha.isEmpty() ){
            auth.createUserWithEmailAndPassword(email, senha)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            usuario = auth.getCurrentUser();
                            Intent intent = new Intent(CadastroAdmin.this, LoginActivity.class);
                            startActivity(intent);
                        }
                    });
        }
    }
}
