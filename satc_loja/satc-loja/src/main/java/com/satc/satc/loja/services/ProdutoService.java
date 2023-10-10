package com.satc.satc.loja.services;

import com.satc.satc.loja.enums.Status;
import com.satc.satc.loja.models.Produto;
import com.satc.satc.loja.models.QProduto;
import com.satc.satc.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class ProdutoService {@Autowired
private ProdutoRepository repository;

    public Produto salvar(Produto entity) {
        return repository.save(entity);
    }

    public List<Produto> buscaTodos() {
        return repository.findAll();
    }

    public Produto buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Produto alterar(Produto entity) {
        return repository.save(entity);
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}
