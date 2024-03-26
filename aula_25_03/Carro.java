public class Carro {
    private Veiculo veiculo;
    private int num_portas;

    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public int getNum_portas() {
        return num_portas;
    }
    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }
    public static class CarroBuilder {
        private Veiculo veiculo;
        private int num_portas;
        public CarroBuilder veiculo(Veiculo veiculo) {
            this.veiculo = veiculo;
            return this;
        }
        public int getNum_portas() {
            return num_portas;
        }
        public void setNum_portas(int num_portas) {
            this.num_portas = num_portas;
        }
    }
}
