package com.satc.satc.loja.repository;


import com.satc.satc.loja.models.Produto;
import com.satc.satc.loja.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}
