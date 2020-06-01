package com.example.appa5.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appa5.R;
import com.example.appa5.dao.ProdutoDAO;

public class CadastroProdutoActivity extends AppCompatActivity {
    EditText etNomeProd, etValor, etQtdProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produto);

        etNomeProd = findViewById(R.id.etNomeProduto);
        etValor = findViewById(R.id.etValor);
        etQtdProd = findViewById(R.id.etQtdProduto);

        Button btnCadastrar = findViewById(R.id.btnCadProduto);
        Button btnSair = findViewById(R.id.btnSairCadastroProduto);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeProduto = etNomeProd.getText().toString();
                Double valor = Double.parseDouble(etValor.getText().toString());
                Integer quantidade = Integer.parseInt(etQtdProd.getText().toString());

                ProdutoDAO produtoDao = new ProdutoDAO();
                try{
                    produtoDao.salvarProduto(nomeProduto, valor, quantidade);
                    finish();
                }catch (Error e){
                    Toast.makeText(CadastroProdutoActivity.this, "Erro ao salvar no banco", Toast.LENGTH_LONG).show();
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
