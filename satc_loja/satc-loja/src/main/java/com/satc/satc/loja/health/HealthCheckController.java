package com.satc.satc.loja.health;


import com.satc.satc.loja.enums.Status;
import com.satc.satc.loja.models.*;
import com.satc.satc.loja.repository.*;
import com.satc.satc.loja.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

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
    @Autowired
    public ProdutoService produtoService;

    @GetMapping("/health")
    public String healthCheck() {
        return " De Boa ";
    }

    @GetMapping("/produto")
    public String healthCheck2() {

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

        return " Produto Adicionado " + produto.getId();
    }

    @GetMapping("/produtoalugado")
    public String healthCheck12() {

        Produto produto = new Produto();
        produto.setDescricao("Produto");
        produto.setNome("Nome Exemplo");
        produto.setValorUnitario(1000.00);
        produto.setDataPrazo(LocalDate.now());
        produto.setDataValidade(LocalDate.now());
        produto.setPrecoCompra(500.00);
        produto.setStatus(Status.ALUGADO);
        produto.setEstocavel(Boolean.TRUE);

        produtoRepository.save(produto);

        return " Produto Adicionado " + produto.getId();
    }

    @GetMapping("/servico")
    public String healthCheck7() {

        Servico servico = new Servico();
        servico.setDescricao("Servico");
        servico.setValorUnitario(1000.00);
        servico.setQuantidadeHoras(12.00);
        servico.setEstocavel(Boolean.TRUE);

        servico = servicoRepository.save(servico);

        return " Produto Adicionado " + servico.getId();
    }

    @GetMapping("/cliente")
    public String healthCheck3() {

        Cliente cliente = new Cliente();
        cliente.setCpf("11212121212");
        cliente.setRg("74747474747");
        cliente.setNome("Gabriel");
        cliente.setEmail("gabriel@gabriel.com");
        cliente.setEndereco("Rua dos Bobos");
        cliente.setTelefone("999999999999");

        cliente = clienteRepository.save(cliente);

        return " Cliente Adicionado " + cliente.getId();


    }

    @GetMapping(path = "/produtos-alugados")
    public List<Produto> produtos (){
       return produtoService.findProdutosAlugados();

    }


}
