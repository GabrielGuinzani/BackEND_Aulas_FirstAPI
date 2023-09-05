package com.satc.satc.loja.models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Item extends EntityID {
    @Column(name = "produto_id")
    private Produto produto;
    @Column(name = "valor_unitario")
    private Double valorUnitario;
    @Column(name = "quantidade")
    private Double quantidade;
    @Column(name = "desconto")
    private Double desconto;



    public Item(Produto produto, Double valorUnitario, Double quantidade, Double desconto) {
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValorCalculado() {
        double valorTotal = this.getValorUnitario() * this.getQuantidade();
        double descontoCalculado = valorTotal * (this.getDesconto() / 100);
        return valorTotal - descontoCalculado;
    }
}
