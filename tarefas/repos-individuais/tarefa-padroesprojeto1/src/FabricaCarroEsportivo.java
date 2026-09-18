public class FabricaCarroEsportivo implements FabricaCarros {
    @Override
    public Carro criarCarro() {
        return new CarroEsportivo();
    }
}

