package com.seuprojeto.microservico_produto.repository;

import com.seuprojeto.microservico_produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<com.seuprojeto.microservico_produto.repository.Produto, Long> {}

