package com.satc.satc.loja.models;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Servico extends ItemVendavel {
    @Column(name ="qtd_horas", nullable = false)
    private Double quantidadeHoras;

    public Servico(String descricao, Double quantidadeHoras, Double valorUnitario) {
        super.setDescricao(descricao);
        super.setValorUnitario(valorUnitario);

        this.quantidadeHoras = quantidadeHoras;
    }

    public Double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public Boolean getEstocavel() {
        return false;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "quantidadeHoras=" + quantidadeHoras +
                "} " + super.toString();
    }
}
