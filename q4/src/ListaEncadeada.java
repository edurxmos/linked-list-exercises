public class ListaEncadeada {

    private Celula inicio;
    private Celula fim;
    private Celula atual;

    void adicionar(Aluno dado) {
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
    }

    void remover() {
        if(inicio.getProximo() != null) {
            Celula celula = recuperarPenultimo(inicio);
            fim = celula;
            celula.setProximo(null);
        } else {
            inicio = fim = null;
        }
    }

    public Aluno pesquisarRecursivo(String nome) {
        return pesquisarRecursivo(inicio, nome);
    }

    private Aluno pesquisarRecursivo(Celula celula, String nome) {
        if (celula == null) {
            return null;
        }
        if (celula.getDado().getNome().equalsIgnoreCase(nome)) {
            return celula.getDado();
        }
        return pesquisarRecursivo(celula.getProximo(), nome);
    }


    void listar() {
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

    void alfabetica() {
        if (inicio == null || inicio.getProximo() == null) return;

        boolean trocou;
        do {
            trocou = false;
            Celula atual = inicio;
            while (atual.getProximo() != null) {
                Aluno a1 = atual.getDado();
                Aluno a2 = atual.getProximo().getDado();

                if (a1.getNome().compareToIgnoreCase(a2.getNome()) > 0) {
                    atual.setDado(a2);
                    atual.getProximo().setDado(a1);
                    trocou = true;
                }
                atual = atual.getProximo();
            }
        } while (trocou);
    }

    private Celula recuperarPenultimo(Celula celula) {
        if (celula.getProximo().equals(fim)) {
            return celula;
        }
        return recuperarPenultimo(celula.getProximo());
    }
}
