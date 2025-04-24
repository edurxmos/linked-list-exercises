public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        int[] numeros = {12, 7, 23, 5, 19, 3, 45, 8, 31, 10, 6, 18, 11, 9, 27};
        for (int numero : numeros) {
            lista.adicionar(numero);
        }

        System.out.println("--- Lista encadeada:");
        lista.listar();

        int numeroProcurado = 8;
        int posicao = lista.buscarPosicao(numeroProcurado);

        if (posicao != -1) {
            System.out.println("\nNúmero " + numeroProcurado + " encontrado na posição: " + posicao);
        } else {
            System.out.println("\nNúmero " + numeroProcurado + " não encontrado na lista.");
        }
    }
}