package AnotacaoTabela;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  // Agora a anotação será mantida em tempo de execução
public @interface Tabela {
    String nome();  // Nome da tabela
}
