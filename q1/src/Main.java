public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("Lista vazia? " + lista.taVazia());
        System.out.println("Tamanho: " + lista.getTamanho());

        System.out.println("\n--- Professores adicionados");
        lista.adicionar(new Professor("Angela"));
        lista.adicionar(new Professor("Camara"));
        lista.adicionar(new Professor("Osvaldo"));

        System.out.println("\n--- Listando professores:");
        lista.listar();

        System.out.println("\nTamanho atual: " + lista.getTamanho());

        System.out.println("\n--- Ultimo professor removido");
        lista.remover();
        lista.listar();

        System.out.print("\nTamanho atual: " + lista.getTamanho());
        System.out.println("\nLista vazia? " + lista.taVazia());

        System.out.println("\n--- Lista apagada");
        lista.apagarLista();

        System.out.println("\n--- Listando após apagar:");
        lista.listar();

        System.out.println("\nLista vazia? " + lista.taVazia());
        System.out.println("Tamanho final: " + lista.getTamanho());

    }
}