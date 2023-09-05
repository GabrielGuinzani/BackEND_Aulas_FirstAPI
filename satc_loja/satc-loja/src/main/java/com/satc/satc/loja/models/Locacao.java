package com.satc.satc.loja.models;

import com.satc.satc.loja.enums.TipoOperacao;
import com.satc.satc.loja.interfaces.OperacaoFinanceira;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Locacao extends EntityID implements OperacaoFinanceira {

    @Column(name = "dt_compra")
    private LocalDate dataLocacao;
    @Column(name = "dt_devolucao")
    private LocalDate dataDevolucao;
    @Column(name = "cliente_id")
    private Cliente cliente;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "observacao")
    private String observacao;
    @OneToMany(mappedBy = "locacao")
    private List<ItemLocacao> itens = new ArrayList<>();

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<ItemLocacao> getItens() {
        return itens;
    }

    public void setItens(List<ItemLocacao> itens) {
        this.itens = itens;
    }

    public void addItem(ItemLocacao item) {
        this.itens.add(item);
    }

    public void removeItem(ItemLocacao item) {
        this.itens.remove(item);
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataLocacao();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream().mapToDouble(ItemLocacao::getValorCalculado).sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }
}
