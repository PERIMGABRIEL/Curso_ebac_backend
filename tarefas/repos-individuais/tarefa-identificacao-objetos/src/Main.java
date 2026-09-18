public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Joao Silva", "Rua A, 123", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Av. B, 456", "12.345.678/0001-99");

        pf.mostrarInformacoes();
        System.out.println();
        pj.mostrarInformacoes();
    }
}
