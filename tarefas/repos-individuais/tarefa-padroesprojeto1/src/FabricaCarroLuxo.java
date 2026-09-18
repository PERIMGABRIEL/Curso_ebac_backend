public class FabricaCarroLuxo implements FabricaCarros {
    @Override
    public Carro criarCarro() {
        return new CarroLuxo();
    }
}

