public class Cliente {
    private FabricaCarros fabrica;

    public Cliente(FabricaCarros fabrica) {
        this.fabrica = fabrica;
    }

    public void exibirDetalhesCarro() {
        Carro carro = fabrica.criarCarro();
        carro.exibirDetalhes();
    }
}
