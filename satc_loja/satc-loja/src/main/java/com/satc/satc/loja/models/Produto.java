package com.satc.satc.loja.models;

import com.satc.satc.loja.enums.Status;

import java.time.LocalDate;

public class Produto extends ItemVendavel {
    private String nome;
    private Double precoCompra;
    private LocalDate dataValidade;
    private LocalDate dataPrazo;
    private Status status;

    public Produto(String nome, String descricao) {
        super.setDescricao(descricao);

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double calcularMargemLucro() {
        return ((super.getValorUnitario() - precoCompra )/ super.getValorUnitario()) * 100;
    }


    public  void setPrecoVenda(Double precoVenda) throws MargemLucroException{
        super.setValorUnitario(precoVenda);
        if (this.calcularMargemLucro() < 20.0){
            throw new MargemLucroException();
        }

    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoCompra=" + precoCompra +
                ", dataValidade=" + dataValidade +
                ", dataPrazo=" + dataPrazo +
                ", status=" + status +
                "} " + super.toString();
    }
}