package com.satc.satc.loja.repository;


import com.satc.satc.loja.models.Fornecedor;
import com.satc.satc.loja.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
