package com.example.appa5.activity;

import android.os.Bundle;

import com.example.appa5.dao.FuncionarioDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appa5.R;

public class CadastroFuncionarioActivity extends AppCompatActivity {
    EditText etNomeFuncionario, etCpf, etSetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        etNomeFuncionario = findViewById(R.id.etNomeFuncionario);
        etCpf = findViewById(R.id.etCpf);
        etSetor = findViewById(R.id.etSetor);
        Button btnCadastrar = findViewById(R.id.btnCadFuncionario);
        Button btnSair = findViewById(R.id.btnSairCadastroFuncionario);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeFuncionario = etNomeFuncionario.getText().toString();
                String cpf = etCpf.getText().toString();
                String setor = etSetor.getText().toString();

                FuncionarioDAO funcionarioDao = new FuncionarioDAO();

                try {
                    funcionarioDao.salvarFuncionario(nomeFuncionario,cpf,setor);
                    finish();
                }catch (Error e){
                    Toast.makeText(CadastroFuncionarioActivity.this,"Erro ao Salvar no Banco", Toast.LENGTH_LONG).show();
                }
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


