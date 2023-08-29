package com.satc.satc.loja.models;

public class Cliente extends Pessoa {
    private String cpf;
    private String rg;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCpf();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                "} " + super.toString();
    }
}
