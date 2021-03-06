package com.example.appa5.entity;

public class Fornecedor {

    private String nomeFornecedor;
    private String telefoneFornecedor;
    private String emailFornecedor;

    @Override
    public String toString() {
        return "Nome Fornecedor: " + nomeFornecedor + "   Telefone: " + telefoneFornecedor + "     Email: " + emailFornecedor;
    }


    public Fornecedor(String nomeFornecedor, String telefoneFornecedor, String emailFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.emailFornecedor = emailFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }
}
