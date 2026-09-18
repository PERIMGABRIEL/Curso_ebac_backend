package com.exemplo.anotacao;

public class Teste {
    public static void main(String[] args) {
        // Verificando se a classe Cliente tem a anotação Tabela
        if (Cliente.class.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = Cliente.class.getAnnotation(Tabela.class);
            System.out.println("Nome da Tabela: " + tabela.nome());
        }
    }
}

