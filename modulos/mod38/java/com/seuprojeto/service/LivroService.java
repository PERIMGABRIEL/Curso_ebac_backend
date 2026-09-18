package com.seuprojeto.service;

import com.seuprojeto.model.Livro;
import com.seuprojeto.repository.LivroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.Year;
import java.util.List;

@ApplicationScoped
public class LivroService {

    @Inject
    private LivroRepository livroRepository;

    public void salvar(Livro livro) {
        if (livro.getAnoPublicacao() > Year.now().getValue()) {
            throw new IllegalArgumentException("Ano de publicação não pode ser no futuro.");
        }
        livroRepository.salvar(livro);
    }

    public List<Livro> listarTodos() {
        return livroRepository.listarTodos();
    }

    public void remover(Livro livro) {
        livroRepository.remover(livro);
    }

    public Livro buscarPorId(Long id) {
        return livroRepository.buscarPorId(id);
    }

    public void atualizar(Livro livro) {
        livroRepository.atualizar(livro);
    }
}
