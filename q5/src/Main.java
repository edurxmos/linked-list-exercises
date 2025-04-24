import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar no início");
            System.out.println("2 - Adicionar no fim");
            System.out.println("3 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para adicionar no início: ");
                    int numInicio = scanner.nextInt();
                    lista.adicionarInicio(numInicio);
                    break;

                case 2:
                    System.out.print("Digite o número para adicionar no fim: ");
                    int numFim = scanner.nextInt();
                    lista.adicionarFim(numFim);
                    break;

                case 3:
                    lista.listar();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}