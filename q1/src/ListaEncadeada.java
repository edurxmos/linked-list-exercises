public class ListaEncadeada {

    private Celula inicio;
    private Celula fim;
    private Celula atual;
    private int tamanho;

    void adicionar(Professor dado) {
        Celula celula = new Celula();
        celula.setDado(dado);
        if (inicio == null) {
            inicio = celula;
            fim = celula;
        } else {
            fim.setProximo(celula);
            fim = celula;
            fim.setProximo(null);
        }
        tamanho++;
    }

    void remover() {
        if(inicio.getProximo() != null) {
            Celula celula = recuperarPenultimo(inicio);
            fim = celula;
            celula.setProximo(null);
        } else {
            inicio = fim = null;
        }
        tamanho--;
    }

    int getTamanho() {
        return tamanho;
    }

    boolean taVazia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    void apagarLista() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }
        Celula atual = inicio;
        while (atual != null) {
            Celula proximo = atual.getProximo();
            atual.setProximo(null);
            atual = proximo;
        }
        inicio = fim = null;
        tamanho = 0;
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        Celula atual = inicio;
        while (atual != null) {
            System.out.println(atual.getDado().getNome());
            atual = atual.getProximo();
        }
    }


    private Celula recuperarPenultimo(Celula celula) {
        if (celula.getProximo().equals(fim)) {
            return celula;
        }
        return recuperarPenultimo(celula.getProximo());
    }
}
