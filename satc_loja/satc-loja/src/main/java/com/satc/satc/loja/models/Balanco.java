package com.satc.satc.loja.models;

import com.satc.satc.loja.enums.TipoOperacao;
import com.satc.satc.loja.interfaces.OperacaoFinanceira;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanco extends EntityID {
    private LocalDate dataBalanco;
    private String responsavel;
    private List<OperacaoFinanceira> operacoes = new ArrayList<>();

    public LocalDate getDataBalanco() {
        return dataBalanco;
    }

    public void setDataBalanco(LocalDate dataBalanco) {
        this.dataBalanco = dataBalanco;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public List<OperacaoFinanceira> getOperacoes() {
        return operacoes;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void addOperacao(OperacaoFinanceira operacao) {
        this.operacoes.add(operacao);
    }

    public void removeOperacao(OperacaoFinanceira operacao) {
        this.operacoes.remove(operacao);
    }

    public String getTipoOperacao(OperacaoFinanceira operacao) {
        if (operacao instanceof Compra) {
            return "Compra";
        }

        if (operacao instanceof Venda) {
            return "Venda";
        }

        return "Locação";
    }
    public Double getValorTotal(TipoOperacao tipo) {
        return this.getOperacoes().stream()
                .filter(op -> op.getTipoOperacao().equals(tipo))
                .mapToDouble(OperacaoFinanceira::getValorTotalOperacao)
                .sum();
    }

    public void imprimirBalanco() {
        System.out.println("---------");
        System.out.println("Balanço número: " + this.getId());
        System.out.println("Data: " + this.getDataBalanco());
        System.out.println("Responsável: " + this.getResponsavel());
        System.out.println("---------");
        System.out.println("Itens: ");

        this.getOperacoes().forEach(operacao -> System.out.println(
                "Data operação: " + operacao.getDataOperacao() +
                " Tipo operação: " + operacao.getTipoOperacao() +
                " Valor operação: " + operacao.getValorTotalOperacao() +
                " - (" + this.getTipoOperacao(operacao) + ")"));

        System.out.println("---------");
        System.out.println("Total débitos: " + this.getValorTotal(TipoOperacao.DEBITO));
        System.out.println("Total créditos: " + this.getValorTotal(TipoOperacao.CREDITO));
        System.out.println("Total: " + (this.getValorTotal(TipoOperacao.CREDITO) - this.getValorTotal(TipoOperacao.DEBITO)));
    }
}
