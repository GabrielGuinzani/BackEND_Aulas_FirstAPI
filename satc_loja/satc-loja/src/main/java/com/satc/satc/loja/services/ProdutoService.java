package com.satc.satc.loja.services;

import com.satc.satc.loja.enums.Status;
import com.satc.satc.loja.models.Produto;
import com.satc.satc.loja.models.QProduto;
import com.satc.satc.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findProdutosAlugados() {

        List<Produto> alugados = repository.findAll(QProduto.produto.status.eq(Status.ALUGADO));
        return alugados;
    }
}
