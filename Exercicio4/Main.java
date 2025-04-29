package Exercicio4;
public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Alice");

        jogador1.exibirInformacoes();

        jogador1.aumentarPontuacao(150);
        jogador1.exibirInformacoes();


        jogador1.subirNivel();
        jogador1.exibirInformacoes();
    }
}