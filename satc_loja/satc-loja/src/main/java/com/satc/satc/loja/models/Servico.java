package com.satc.satc.loja.models;

public class Servico extends ItemVendavel {
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
