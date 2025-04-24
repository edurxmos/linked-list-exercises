public class Celula {

    private Aluno dado;
    private Celula proximo;

    public Celula() {
    }

    public Celula(Aluno dado, Celula proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }

    public Aluno getDado() {
        return dado;
    }

    public void setDado(Aluno dado) {
        this.dado = dado;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
