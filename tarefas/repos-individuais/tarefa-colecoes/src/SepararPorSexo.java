import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararPorSexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.print("Digite os nomes e sexos das pessoas no formato 'Nome-sexo', separados por vírgula: ");
        String input = scanner.nextLine();

        String[] pessoas = input.split(",");

        for (String pessoa : pessoas) {
            pessoa = pessoa.trim();
            String[] dados = pessoa.split("-");

            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    grupoMasculino.add(nome);
                } else if (sexo.equals("F")) {
                    grupoFeminino.add(nome);
                } else {
                    System.out.println("Sexo inválido para " + nome);
                }
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
