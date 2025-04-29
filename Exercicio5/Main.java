package Exercicio5;
public class Main {
    public static void main(String[] args) {


        Carro meuCarro = new Carro("Ford", "Mustang", 1967, "ABC-1234");

        meuCarro.exibirInformacoes();

        meuCarro.acelerar(50);
        System.out.println("Após acelerar:");
        meuCarro.exibirInformacoes();

        meuCarro.frear(20);
        System.out.println("Após frear:");
        meuCarro.exibirInformacoes();

        meuCarro.frear(40);
        System.out.println("Após frear novamente:");
        meuCarro.exibirInformacoes();
    }
}