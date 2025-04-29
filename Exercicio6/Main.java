package Exercicio6;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Adicionando contatos
        agenda.adicionarContato(new Contato("Alice", "1234-5678"));
        agenda.adicionarContato(new Contato("Bob", "8765-4321"));

        // Listando contatos
        agenda.listarContatos();

        // Buscando um contato
        Contato contato = agenda.buscarContatoPorNome("Alice");
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Removendo um contato
        agenda.removerContato("Bob");
        agenda.listarContatos();
    }
}
