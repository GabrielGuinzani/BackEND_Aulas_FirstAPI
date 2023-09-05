package com.satc.satc.loja.health;


import com.satc.satc.loja.models.Produto;
import com.satc.satc.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Autowired
    public ProdutoRepository produtoRepository;

    @GetMapping("/health")
    public String healthCheck(){
        return " De Boa ";
    }

    @GetMapping("/teste")
    public String healthCheck2(){

        Produto produto = new Produto();
        produto.setDescricao("Produto");
        produtoRepository.save(produto);

        return " De Boa "+ produto.getId();
    }

}
