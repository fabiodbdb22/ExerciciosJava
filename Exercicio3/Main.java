package Exercicio3;
public class Main {
    public static void main(String[] args) {
        // Criando uma conta
        ContaBancaria conta = new ContaBancaria("12345-6", "João");


        conta.depositar(500.00);
        System.out.println("Saldo: R$ " + conta.consultarSaldo());

        conta.sacar(200.00);
        System.out.println("Saldo: R$ " + conta.consultarSaldo());

        conta.sacar(400.00);
        System.out.println("Saldo: R$ " + conta.consultarSaldo());
    }
}