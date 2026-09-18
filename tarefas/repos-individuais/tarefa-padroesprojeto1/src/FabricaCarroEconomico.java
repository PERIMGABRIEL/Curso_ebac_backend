public class FabricaCarroEconomico implements FabricaCarros {
    @Override
    public Carro criarCarro() {
        return new CarroEconomico();
    }
}
