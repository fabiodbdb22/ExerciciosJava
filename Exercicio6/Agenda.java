package Exercicio6;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato);
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se o contato não for encontrado
    }

    public void removerContato(String nome) {
        Contato contatoParaRemover = buscarContatoPorNome(nome);
        if (contatoParaRemover != null) {
            contatos.remove(contatoParaRemover);
            System.out.println("Contato removido: " + contatoParaRemover);
        } else {
            System.out.println("Contato não encontrado: " + nome);
        }
    }

    public void listarContatos() {
        System.out.println("Lista de Contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
