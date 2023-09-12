package com.satc.satc.loja.repository;


import com.satc.satc.loja.models.Locacao;
import com.satc.satc.loja.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Long> {
}
