package com.satc.satc.loja.interfaces;



import com.satc.satc.loja.enums.TipoOperacao;

import java.time.LocalDate;

public interface OperacaoFinanceira {
    public LocalDate getDataOperacao();
    public Double getValorTotalOperacao();
    public TipoOperacao getTipoOperacao();
}
