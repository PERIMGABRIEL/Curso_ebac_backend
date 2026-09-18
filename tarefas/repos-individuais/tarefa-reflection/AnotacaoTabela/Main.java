package AnotacaoTabela;

public class Main {

    public static void main(String[] args) {
        // Criando uma instância da classe Cliente
        Cliente cliente = new Cliente();

        // Usando os métodos set para definir valores
        cliente.setId(1);
        cliente.setNome("Gabriel");
        cliente.setEmail("gabriel@example.com");

        // Usando os métodos get para pegar os valores
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());

        // Verificando se a anotação Tabela está presente na classe Cliente
        if (Cliente.class.isAnnotationPresent(Tabela.class)) {
            // Pegando a anotação Tabela da classe Cliente
            Tabela tabela = Cliente.class.getAnnotation(Tabela.class);

            // Imprimindo o nome da tabela
            System.out.println("Nome da Tabela: " + tabela.nome());
        } else {
            System.out.println("A anotação Tabela não está presente na classe Cliente.");
        }
    }
}

