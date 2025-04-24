public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("--- Alunos adicionados");
        lista.adicionar(new Aluno("Celso"));
        lista.adicionar(new Aluno("Daniel"));
        lista.adicionar(new Aluno("Gabriela"));
        lista.adicionar(new Aluno("Eduardo"));

        System.out.println("\n--- Listando alunos:");
        lista.listar();

        System.out.println("\n--- Lista em ordem alfabética:");
        lista.alfabetica();
        lista.listar();

        System.out.println("\n--- Pesquisando (recursivo) aluno 'Daniel':");
        Aluno aluno = lista.pesquisarRecursivo("Daniel");
        if (aluno != null) {
            System.out.println("Aluno encontrado: " + aluno.getNome());
        } else {
            System.out.println("Aluno não encontrado.");
        }

        System.out.println("\n--- Último aluno removido:");
        lista.remover();
        lista.listar();
    }
}