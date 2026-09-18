import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite os nomes e sexos (nome, sexo), e 'fim' para encerrar:");

        String entrada;
        while (!(entrada = scanner.nextLine()).equalsIgnoreCase("fim")) {
            String[] dados = entrada.split(",");
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim();
                pessoas.add(new Pessoa(nome, sexo));
            }
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("feminino")) // Filtra mulheres
                .collect(Collectors.toList());

        System.out.println("\nMulheres na lista:");
        mulheres.forEach(System.out::println);
    }
}
