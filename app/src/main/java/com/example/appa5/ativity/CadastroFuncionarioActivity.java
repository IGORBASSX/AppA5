package com.example.appa5.ativity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appa5.R;
import com.example.appa5.dao.FuncionarioDAO;

public class CadastroFuncionarioActivity extends AppCompatActivity {

    private EditText etNomeFuncionario, etCargo, etEmail;
    private Button btnCadFuncionario, btnSairCadastroFuncionairo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        etNomeFuncionario = findViewById(R.id.etNomeFuncionario);
        etCargo = findViewById(R.id.etCargo);
        etEmail = findViewById(R.id.etEmail);
        btnSairCadastroFuncionairo = findViewById(R.id.btnSairCadastroFuncionairo);
        btnCadFuncionario = findViewById(R.id.btnCadFuncionario);


        btnCadFuncionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeFuncionario = etNomeFuncionario.getText().toString();
                String cargoFuncionario = etCargo.getText().toString();
                String emailFuncionario = etEmail.getText().toString();

                FuncionarioDAO funcionarioDao = new FuncionarioDAO();
                try{
                    funcionarioDao.salvarFuncionario(nomeFuncionario, cargoFuncionario, emailFuncionario);
                    finish();
                }catch (Error e){
                    Toast.makeText(CadastroFuncionarioActivity.this, "Erro ao salvar no banco", Toast.LENGTH_LONG).show();
                }
            }

        });

        btnSairCadastroFuncionairo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
