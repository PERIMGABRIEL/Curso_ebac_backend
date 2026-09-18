// Classe que representa um Carro no mundo real
public class Carro {

    // Propriedades do Carro
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private boolean ligado;

    // Construtor para inicializar o objeto Carro
    public Carro(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.ligado = false; // O carro começa desligado
    }

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando.");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    // Getters e Setters (métodos para acessar as propriedades)

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}