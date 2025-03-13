package com.example.demo.repository;

import com.example.demo.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();
    private Long idCounter = 1L;

    public List<Produto> findAll() { return produtos; }

    public Optional<Produto> findById(Long id) {
        return produtos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public Produto save(Produto produto) {
        produto.setId(idCounter++);
        produtos.add(produto);
        return produto;
    }

    public void deleteById(Long id) {
        produtos.removeIf(p -> p.getId().equals(id));
    }
}
