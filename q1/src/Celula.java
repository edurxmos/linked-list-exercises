public class Celula {

    private Professor dado;
    private Celula proximo;

    public Celula() {
    }

    public Celula(Professor dado, Celula proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }

    public Professor getDado() {
        return dado;
    }

    public void setDado(Professor dado) {
        this.dado = dado;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
