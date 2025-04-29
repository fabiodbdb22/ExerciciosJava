package Exercicio1;
public class Main {
    public static void main(String[] args) {
        double num1 = 20.0;
        double num2 = 12.0;

        System.out.println("Adição: " + Calculadora.adicionar(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));

        try {
            System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
            System.out.println("Divisão por zero: " + Calculadora.dividir(num1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}