package com.example.appa5.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appa5.R;
import com.example.appa5.dao.FornecedorDAO;

public class CadastroFornecedorActivity extends AppCompatActivity {

    private EditText etNomeFornecedor, etTelefoneFornecedor, etEmailFornecedor;
    private Button btnCadFornecedor, btnSairCadastroFornecedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_fornecedor);

        etNomeFornecedor = findViewById(R.id.etNomeFuncionario);
        etTelefoneFornecedor = findViewById(R.id.etTelefoneFornecedor);
        etEmailFornecedor = findViewById(R.id.etEmailFornecedor);

        btnCadFornecedor = findViewById(R.id.btnCadFornecedor);
        btnSairCadastroFornecedor = findViewById(R.id.btnSairCadastroFornecedor);

        btnSairCadastroFornecedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCadFornecedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeFornecedor = etNomeFornecedor.getText().toString();
                String telefoneFornecedor = etTelefoneFornecedor.getText().toString();
                String emailFornecedor = etNomeFornecedor.getText().toString();

                FornecedorDAO fornecedorDAO = new FornecedorDAO();
                try {
                    fornecedorDAO.salvarFornecedor(nomeFornecedor, telefoneFornecedor, emailFornecedor);
                    finish();
                } catch (Error e) {
                    Toast.makeText(CadastroFornecedorActivity.this, "Erro ao salvar no banco", Toast.LENGTH_LONG).show();
                }
            }

        });


    }
}