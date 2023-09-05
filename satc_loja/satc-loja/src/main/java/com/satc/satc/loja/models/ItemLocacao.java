package com.satc.satc.loja.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ItemLocacao extends Item {

    @ManyToOne
    @JoinColumn(name = "locacao_id")
    private Locacao locacao;

    public ItemLocacao(Produto produto, Double valorUnitario, Double quantidade, Double desconto) {
        super(produto, valorUnitario, quantidade, desconto);
    }
}
