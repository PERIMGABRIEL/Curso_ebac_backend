package com.seuprojeto.repository;

import com.seuprojeto.model.Livro;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@ApplicationScoped
public class LivroRepository {

    @PersistenceContext
    private EntityManager em;

    public void salvar(Livro livro) {
        em.persist(livro);
    }

    public List<Livro> listarTodos() {
        return em.createQuery("from Livro", Livro.class).getResultList();
    }

    public void remover(Livro livro) {
        em.remove(em.merge(livro));
    }

    public Livro buscarPorId(Long id) {
        return em.find(Livro.class, id);
    }

    public void atualizar(Livro livro) {
        em.merge(livro);
    }
}
