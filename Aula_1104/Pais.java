import java.util.Comparator;

public class Pais {
    private String nomePais;
    private int popPais;
    private int territorioPais;

    public Pais(String nomePais, int popPais, int territorioPais) {
        this.setNomePais(nomePais);
        this.setPopPais(popPais);
        this.setTerritorioPais(territorioPais);
    }

    public Pais() {

    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public int getPopPais() {
        return popPais;
    }

    public void setPopPais(int popPais) {
        this.popPais = popPais;
    }

    public int getTerritorioPais() {
        return territorioPais;
    }

    public void setTerritorioPais(int territorioPais) {
        this.territorioPais = territorioPais;
    }

    //Esse método sobrescreve o toString e formata ele
    @Override
    public String toString() {
        return "Nome do país: " + this.getNomePais() +
                "\nPopulação: " + this.getPopPais() +
                "\nTerritório: " + this.getTerritorioPais();
    }
}
