public class ListaEncadeada {
    private Celula inicio;
    private Celula fim;
    private int tamanho = 0;
    private final int LIMITE = 7;

    public boolean estaCheia() {
        return tamanho >= LIMITE;
    }

    public void adicionarInicio(int valor) {
        if (estaCheia()) {
            System.out.println("Lista cheia! Não é possível adicionar no início.");
            return;
        }

        Celula nova = new Celula();
        nova.setDado(valor);

        if (inicio == null) {
            inicio = fim = nova;
        } else {
            nova.setProximo(inicio);
            inicio = nova;
        }
        tamanho++;
    }

    public void adicionarFim(int valor) {
        if (estaCheia()) {
            System.out.println("Lista cheia! Não é possível adicionar no fim.");
            return;
        }

        Celula nova = new Celula();
        nova.setDado(valor);

        if (inicio == null) {
            inicio = fim = nova;
        } else {
            fim.setProximo(nova);
            fim = nova;
        }
        tamanho++;
    }

    public void listar() {
        Celula atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
