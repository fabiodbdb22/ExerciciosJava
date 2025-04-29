package Exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

    public void atualizarProduto(String codigo, double novoPreco, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produto.atualizarPreco(novoPreco);
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void removerProduto(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produtos.remove(produto);
                System.out.println("Produto removido: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void gerarRelatorio() {
        double valorTotalEstoque = 0;
        System.out.println("Relatório de Estoque:");
        for (Produto produto : produtos) {
            System.out.println(produto);
            valorTotalEstoque += produto.valorTotalEmEstoque();
        }
        System.out.println("Valor total em estoque: " + valorTotalEstoque);
    }
}