package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;

    public Pedido(String enderecoEntrega) {
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = enderecoEntrega;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void cancelarPedido() {
        pizzas.clear();
        System.out.println("Pedido cancelado.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getValor();
        }
        return total;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pizzas=" + pizzas +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                '}';
    }
}
