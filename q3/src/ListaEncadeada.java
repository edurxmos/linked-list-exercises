public class ListaEncadeada {

    private Celula inicio;
    private Celula fim;

    public void adicionar(int valor) {
        Celula celula = new Celula();
        celula.setDado(valor);
        if (inicio == null) {
            inicio = fim = celula;
        } else {
            fim.setProximo(celula);
            fim = celula;
        }
    }

    public void listar() {
        Celula atual = inicio;
        int index = 0;
        while (atual != null) {
            System.out.println("Posição " + index + ": " + atual.getDado());
            atual = atual.getProximo();
            index++;
        }
    }

    public int buscarPosicao(int valor) {
        Celula atual = inicio;
        int posicao = 0;
        while (atual != null) {
            if (atual.getDado() == valor) {
                return posicao;
            }
            atual = atual.getProximo();
            posicao++;
        }
        return -1;
    }
}
