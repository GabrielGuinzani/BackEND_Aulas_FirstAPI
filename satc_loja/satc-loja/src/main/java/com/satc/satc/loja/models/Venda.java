package com.satc.satc.loja.models;


import com.satc.satc.loja.enums.FormaPagamento;
import com.satc.satc.loja.enums.TipoOperacao;
import com.satc.satc.loja.interfaces.OperacaoFinanceira;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda extends EntityID implements OperacaoFinanceira {
    private LocalDate dataVenda;
    private FormaPagamento formaPagamento;
    private String observacao;
    private Cliente cliente;
    private List<ItemVenda> itens = new ArrayList<>();

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void addItem(ItemVenda item) {
        this.itens.add(item);
    }

    public void removeItem(ItemVenda item) {
        this.itens.remove(item);
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataVenda();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream().mapToDouble(ItemVenda::getValorCalculado).sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }
}
