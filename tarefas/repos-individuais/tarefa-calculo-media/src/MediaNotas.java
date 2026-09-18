import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
