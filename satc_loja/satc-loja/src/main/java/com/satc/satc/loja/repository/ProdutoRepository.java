package com.satc.satc.loja.repository;


import com.satc.satc.loja.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>, CustomQuerydslPredicateExecutor<Produto> {
}


