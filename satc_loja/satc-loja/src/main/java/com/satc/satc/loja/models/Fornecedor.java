package com.satc.satc.loja.models;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private String ie;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCnpj();
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj='" + cnpj + '\'' +
                ", ie='" + ie + '\'' +
                "} " + super.toString();
    }
}
