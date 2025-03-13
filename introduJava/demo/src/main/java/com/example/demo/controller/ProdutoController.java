package com.example.demo.controller;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscarProduto(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
        Optional<Produto> produto = repository.findById(id);
        if (produto.isPresent()) {
            Produto p = produto.get();
            p.setNome(produtoAtualizado.getNome());
            p.setPreco(produtoAtualizado.getPreco());
            return p;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
