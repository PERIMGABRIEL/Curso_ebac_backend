public class Main {
    public static void main(String[] args) {
        FabricaCarros fabrica = new FabricaCarroEsportivo();
        Cliente cliente = new Cliente(fabrica);

        cliente.exibirDetalhesCarro();

        fabrica = new FabricaCarroLuxo();
        cliente = new Cliente(fabrica);
        cliente.exibirDetalhesCarro();
    }
}
