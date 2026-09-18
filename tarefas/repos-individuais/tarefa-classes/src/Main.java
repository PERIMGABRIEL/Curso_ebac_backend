public class Main {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Ford", "F-150", "Azul", 2023);

        // Testando os métodos
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.desligar();
    }
}
