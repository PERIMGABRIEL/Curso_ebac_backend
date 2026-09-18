import java.util.Scanner;

public class ConvertePrimitivoParaWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt();

        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor convertido para wrapper (Integer): " + numeroWrapper);

        scanner.close();
    }
}

