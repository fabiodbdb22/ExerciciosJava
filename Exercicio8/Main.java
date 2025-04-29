package Exercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Pizza> cardapio = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        inicializarCardapio();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Fazer Pedido");
            System.out.println("2. Cancelar Pedido");
            System.out.println("3. Gerar Relatório de Pedidos");
            System.out.println("4. Adicionar Nova Pizza ao Cardápio");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    fazerPedido(scanner);
                    break;
                case 2:
                    cancelarPedido(scanner);
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    adicionarPizza(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void adicionarPizza(Scanner scanner) {
        
    }

    private static void inicializarCardapio() {
        cardapio.add(new Pizza("Margherita", 25.00, "Molho de tomate, queijo, manjericão"));
        cardapio.add(new Pizza("Pepperoni", 30.00, "Molho de tomate, queijo, pepperoni"));
        cardapio.add(new Pizza("Quatro Queijos", 35.00, "Queijo muçarela, queijo gorgonzola, queijo parmesão, queijo provolone"));
        cardapio.add(new Pizza("Frango com Catupiry", 32.00, "Frango desfiado, catupiry, queijo"));
    }

    private static void fazerPedido(Scanner scanner) {
        System.out.print("Endereço de entrega: ");
        String endereco = scanner.nextLine();
        Pedido pedido = new Pedido(endereco);

        System.out.println("Escolha as pizzas:");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println((i + 1) + ". " + cardapio.get(i));
        }
        System.out.println("Digite o número da pizza que deseja adicionar (0 para finalizar):");
        int escolha;
        while ((escolha = scanner.nextInt()) != 0) {
            if (escolha > 0 && escolha <= cardapio.size()) {
                pedido.adicionarPizza(cardapio.get(escolha - 1));
                System.out.println("Pizza adicionada: " + cardapio.get(escolha - 1).getNome());
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
            System.out.println("Digite o número da pizza que deseja adicionar (0 para finalizar):");
        }
        pedidos.add(pedido);
        System.out.println("Pedido realizado com sucesso!");
    }

    private static void cancelarPedido(Scanner scanner) {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos para cancelar.");
            return;
        }
        System.out.print("Digite o número do pedido a ser cancelado (1 a " + pedidos.size() + "): ");
        int numeroPedido = scanner.nextInt();
        if (numeroPedido > 0 && numeroPedido <= pedidos.size()) {
            pedidos.remove(numeroPedido - 1);
            System.out.println("Pedido cancelado com sucesso.");
        } else {
            System.out.println("Número de pedido inválido.");
        }
    }

    private static void gerarRelatorio() {
        System.out.println("\nRelatório de Pedidos:");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido realizado.");
            return;
        }
        double totalGeral = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido pedido = pedidos.get(i);
            System.out.println("Pedido " + (i + 1) + ": " + pedido);
            totalGeral += pedido.calcularTotal();
        }
        System.out.println("Total de pedidos: " + pedidos.size());
    }
}
