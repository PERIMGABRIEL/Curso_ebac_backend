import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes das pessoas separados por vírgula: ");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("\nNomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
