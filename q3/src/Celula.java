public class Celula {

    private int dado;
    private Celula proximo;

    public Celula() {
    }

    public Celula(int dado, Celula proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
