package com.satc.satc.loja.models;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_item")
public abstract class ItemVendavel extends EntityID {

    @Column(name = "descricao", nullable = false)
    private String descricao;
    @Column(name = "valor_unitario", nullable = false)
    private Double valorUnitario;
    @Column(name = "estocavel", nullable = true)
    private Boolean estocavel;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Boolean getEstocavel() {
        return estocavel;
    }

    public void setEstocavel(Boolean estocavel) {
        this.estocavel = estocavel;
    }

    @Override
    public String toString() {
        return "ItemVendavel{" +
                "descricao='" + descricao + '\'' +
                ", valorUnitario=" + valorUnitario +
                "} " + super.toString();
    }
}
