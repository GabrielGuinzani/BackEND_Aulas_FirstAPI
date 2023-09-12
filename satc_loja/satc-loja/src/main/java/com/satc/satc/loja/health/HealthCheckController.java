package com.satc.satc.loja.health;


import com.satc.satc.loja.enums.Status;
import com.satc.satc.loja.models.*;
import com.satc.satc.loja.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HealthCheckController {

    @Autowired
    public ProdutoRepository produtoRepository;
    @Autowired
    public ClienteRepository clienteRepository;
    @Autowired
    public LocacaoRepository locacaoRepository;
    @Autowired
    public ServicoRepository servicoRepository;
    @Autowired
    public CompraRepository compraRepository;
    @Autowired
    public VendaRepository vendaRepository;
    @Autowired
    public FornecedorRepository fornecedorRepository;

    @GetMapping("/health")
    public String healthCheck(){
        return " De Boa ";
    }

    @GetMapping("/produto")
    public String healthCheck2(){

        Produto produto = new Produto();
        produto.setDescricao("Produto");
        produto.setNome("Nome Exemplo");
        produto.setValorUnitario(1000.00);
        produto.setDataPrazo(LocalDate.now());
        produto.setDataValidade(LocalDate.now());
        produto.setPrecoCompra(500.00);
        produto.setStatus(Status.DISPONIVEL);
        produto.setEstocavel(Boolean.TRUE);

        produtoRepository.save(produto);

        return " Produto Adicionado "+ produto.getId();
    }

    @GetMapping("/servico")
    public String healthCheck7(){

        Servico servico = new Servico();
        servico.setDescricao("Servico");
        servico.setValorUnitario(1000.00);
        servico.setQuantidadeHoras(12.00);
        servico.setEstocavel(Boolean.TRUE);

        servico = servicoRepository.save(servico);

        return " Produto Adicionado "+ servico.getId();
    }

    @GetMapping("/cliente")
    public String healthCheck3(){

        Cliente cliente = new Cliente();
        cliente.setCpf("11212121212");
        cliente.setRg("74747474747");
        cliente.setNome("Gabriel");
        cliente.setEmail("gabriel@gabriel.com");
        cliente.setEndereco("Rua dos Bobos");
        cliente.setTelefone("999999999999");

        cliente = clienteRepository.save(cliente);

        return " Cliente Adicionado "+ cliente.getId();
    }

    @GetMapping("/fornecedor")
    public String healthCheck5(){

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setDescricao("Produto");
        fornecedor.setNome("Nome Exemplo");
        fornecedor.setValorUnitario(1000.00);
        fornecedor.setDataPrazo(LocalDate.now());
        fornecedor.setDataValidade(LocalDate.now());
        fornecedor.setPrecoCompra(500.00);
        fornecedor.setStatus(Status.DISPONIVEL);
        fornecedor.setEstocavel(Boolean.TRUE);

        produtoRepository.save(produto);

        return " Produto Adicionado "+ produto.getId();
    }

    @GetMapping("/compra")
    public String healthCheck4(){

        Compra compra = new Compra();
        compra.setDataCompra(LocalDate.now());
        compra.setFornecedor("Nome Exemplo");
        compra.setValorUnitario(1000.00);
        compra.setDataPrazo(LocalDate.now());
        compra.setDataValidade(LocalDate.now());
        compra.setPrecoCompra(500.00);
        compra.setStatus(Status.DISPONIVEL);
        compra.setEstocavel(Boolean.TRUE);

        compra = compraRepository.save(compra);

        return " Produto Adicionado "+ compra.getId();
    }



    @GetMapping("/locacao")
    public String healthCheck6(){

        Produto produto = new Produto();
        produto.setDescricao("Produto");
        produto.setNome("Nome Exemplo");
        produto.setValorUnitario(1000.00);
        produto.setDataPrazo(LocalDate.now());
        produto.setDataValidade(LocalDate.now());
        produto.setPrecoCompra(500.00);
        produto.setStatus(Status.DISPONIVEL);
        produto.setEstocavel(Boolean.TRUE);

        produtoRepository.save(produto);

        return " Produto Adicionado "+ produto.getId();
    }



    @GetMapping("/venda")
    public String healthCheck8(){

        Produto produto = new Produto();
        produto.setDescricao("Produto");
        produto.setNome("Nome Exemplo");
        produto.setValorUnitario(1000.00);
        produto.setDataPrazo(LocalDate.now());
        produto.setDataValidade(LocalDate.now());
        produto.setPrecoCompra(500.00);
        produto.setStatus(Status.DISPONIVEL);
        produto.setEstocavel(Boolean.TRUE);

        produtoRepository.save(produto);

        return " Produto Adicionado "+ produto.getId();
    }

}
