package Exercicio5;
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; // Inicializa a velocidade com 0
    }


    public void acelerar(double aumento) {
        if (aumento > 0) {
            velocidadeAtual += aumento; // Aumenta a velocidade
        }
    }


    public void frear(double reducao) {
        if (reducao > 0) {
            velocidadeAtual -= reducao;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}
