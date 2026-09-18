package com.seuprojeto.controller;

import com.seuprojeto.model.Livro;
import com.seuprojeto.service.LivroService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class LivroController implements Serializable {

    private Livro livro = new Livro();

    @Inject
    private LivroService livroService;

    public void salvar() {
        livroService.salvar(livro);
        livro = new Livro(); // limpa o formulário
    }

    public List<Livro> getLivros() {
        return livroService.listarTodos();
    }

    public void remover(Livro livro) {
        livroService.remover(livro);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
