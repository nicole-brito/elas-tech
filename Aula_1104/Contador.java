public class Contador {
    private int n;

    public Contador(int n) {
        this.n = n;
    }

    public void setN(int n) {
        this.n = n;
    }

    //Mostra o valor
    public int getN() {
        return n;
    }

    //Zera o contador
    public void zerar() {
        this.n = 0;
    }

    //Incrementa
    public void incrementar () {
        this.n++;
    }
}
