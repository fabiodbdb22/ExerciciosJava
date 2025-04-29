package Exercicio4;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0; // Inicializa a pontuação com 0
        this.nivel = 1; // Inicializa o nível com 1
    }

    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
            System.out.println("Pontuação aumentada em " + pontos + " pontos.");
        } else {
            System.out.println("A pontuação deve ser um valor positivo.");
        }
    }

    public void subirNivel() {
        this.nivel++;
        System.out.println("Parabéns! Você subiu para o nível " + this.nivel + "!");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " + this.nivel);
    }
}