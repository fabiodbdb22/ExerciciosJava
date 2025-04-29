package Exercicio7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Gerenciamento de Estoque:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Gerar Relatório de Estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    adicionarProduto(scanner, estoque);
                    break;
                case 2:
                    atualizarProduto(scanner, estoque);
                    break;
                case 3:
                    removerProduto(scanner, estoque);
                    break;
                case 4:
                    estoque.listarProdutos();
                    break;
                case 5:
                    estoque.gerarRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarProduto(Scanner scanner, Estoque estoque) {
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do Produto: ");
        String codigo = scanner.nextLine();
        System.out.print("Preço do Produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        int quantidade = scanner.nextInt();
        estoque.adicionarProduto(new Produto(nome, codigo, preco, quantidade));
    }

    private static void atualizarProduto(Scanner scanner, Estoque estoque) {
        System.out.print("Código do Produto a ser atualizado: ");
        String codigo = scanner.nextLine();
        System.out.print("Novo Preço: ");
        double novoPreco = scanner.nextDouble();
        System.out.print("Nova Quantidade: ");
        int novaQuantidade = scanner.nextInt();
        estoque.atualizarProduto(codigo, novoPreco, novaQuantidade);
    }

    private static void removerProduto(Scanner scanner, Estoque estoque) {
        System.out.print("Código do Produto a ser removido: ");
        String codigo = scanner.nextLine();
        estoque.removerProduto(codigo);
    }
}