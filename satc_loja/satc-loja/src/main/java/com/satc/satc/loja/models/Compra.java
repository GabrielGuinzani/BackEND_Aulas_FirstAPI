package com.satc.satc.loja.models;


import com.satc.satc.loja.enums.TipoOperacao;
import com.satc.satc.loja.interfaces.OperacaoFinanceira;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Compra extends EntityID implements OperacaoFinanceira {
    @Column(name = "dt_compra", nullable = false)
    private LocalDate dataCompra;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;
    @Column(name = "observacao")
    private String observacao;
    @OneToMany(mappedBy = "compra")
    private List<ItemCompra> itens = new ArrayList<>();

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    public void addItem(ItemCompra item) {
        item.setCompra(this);
        this.itens.add(item);
    }

    public void removeItem(ItemCompra item) {
        this.itens.remove(item);
    }



    @Override
    public LocalDate getDataOperacao() {
        return this.getDataCompra();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream().mapToDouble(ItemCompra::getValorCalculado).sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.DEBITO;
    }
}
