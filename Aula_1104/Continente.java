import java.util.*;
public class Continente extends Pais {
    private String nomeContinente;
    ArrayList<Pais> paises = new ArrayList();
    public Continente() {
        super();
        this.nomeContinente = nomeContinente;
    }

    //Construtor que inicializa o nome do continente
    public Continente(String nomeContinente) {
    }
    public String getNomeContinente() {
        return nomeContinente;
    }
    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    //Método que adiciona um país ao continente
    public void addPais(Pais pais) {
        paises.add(pais);
        System.out.println(pais.getNomePais() + " adicionado com sucesso!");
    }
    public int popContinente() {
        int populacao = 0;
        for (Pais pais : paises) {
            populacao += pais.getPopPais();
        }
        return populacao;
    }
    public int terContinente() {
        int territorio = 0;
        for (Pais pais : paises) {
            territorio += pais.getTerritorioPais();
        }
        return territorio;
    }
    public int densidadePopContinente() {
        int populacao = 0;
        int dimensao = 0;
        for (Pais pais : paises) {
            populacao += pais.getPopPais();
            dimensao += pais.getTerritorioPais();
        }
        return populacao / dimensao;
    }

    //Método que retorna o pais com menor territorio
    public Pais paisMenorTerritorio() {
        if (paises.isEmpty()) {
            System.out.println("A lista está vazia, gostaria de adicionar alguns países?");
        }

        //Só deus e o github copilot sabem o que é esse trecho de código
        Pais paisComMenorDimensao = paises.get(1);
        int menorDimensao = paisComMenorDimensao.getTerritorioPais();
        for (Pais pais : paises) {
            int paisDimensao = pais.getTerritorioPais();
            if (paisDimensao < menorDimensao) {
                paisComMenorDimensao = pais;
                menorDimensao = paisDimensao;
            }
        }
        return paisComMenorDimensao;
    }
    public void mostraMenorPais () {
        System.out.println("Menor país do continente: " + paisMenorTerritorio().getNomePais() + ", com " + paisMenorTerritorio().getTerritorioPais() + " km².");
    }

    //Método que retorna o pais com maior territorio
    public Pais paisMaiorTerritorio() {
        if (paises.isEmpty()) {
            System.out.println("A lista está vazia, gostaria de adicionar alguns países?");
        }

        //Só deus e o github copilot sabem o que é esse trecho de código
        Pais paisComMaiorDimensao = paises.get(1);
        int maiorDimensao = paisComMaiorDimensao.getTerritorioPais();
        for (Pais pais : paises) {
            int paisDimensao = pais.getTerritorioPais();
            if (paisDimensao > maiorDimensao) {
                paisComMaiorDimensao = pais;
                maiorDimensao = paisDimensao;
            }
        }
        return paisComMaiorDimensao;
    }
    public void mostraMaiorPais () {
        System.out.println("Maior país do continente: " + paisMaiorTerritorio().getNomePais() + ", com " + paisMaiorTerritorio().getTerritorioPais() + " km².");
    }

    //Método que retorna o pais menos populoso
    public Pais paisMenosPopuloso() {
        if (paises.isEmpty()) {
            System.out.println("A lista está vazia, gostaria de adicionar alguns países?");
        }

        Pais paisMenosPopuloso = paises.get(2);
        int menorPopulacao = paisMenosPopuloso.getPopPais();
        for (Pais pais : paises) {
            int paisPopulacao = pais.getPopPais();
            if (paisPopulacao < menorPopulacao) {
                paisMenosPopuloso = pais;
                menorPopulacao = paisPopulacao;
            }
        }
        return paisMenosPopuloso;
    }
    public void mostraMenorPopulacao () {
        System.out.println("O país menos populoso é: " + paisMenosPopuloso().getNomePais() + ", com " + paisMenosPopuloso().getPopPais() + " habitantes.");
    }

    //Método que retorna o pais mais populoso
    public Pais paisMaisPopuloso() {
        if (paises.isEmpty()) {
            System.out.println("A lista está vazia, gostaria de adicionar alguns países?");
        }

        Pais paisMaisPopuloso = paises.get(2);
        int maiorPopulacao = paisMaisPopuloso.getPopPais();
        for (Pais pais : paises) {
            int paisPopulacao = pais.getPopPais();
            if (paisPopulacao > maiorPopulacao) {
                paisMaisPopuloso = pais;
                maiorPopulacao = paisPopulacao;
            }
        }
        return paisMaisPopuloso;
    }
    public void mostraMaiorPopulacao () {
        System.out.println("O país mais populoso é " + paisMaisPopuloso().getNomePais() + ", com " + paisMaisPopuloso().getTerritorioPais() + " habitantes.");
    }
    public void razaoTerritorial() {
        Pais maior = paisMaiorTerritorio();
        Pais menor = paisMenorTerritorio();
        System.out.println("A razão territorial entre o maior e o menor país do continente é de " + maior.getTerritorioPais()/menor.getTerritorioPais());

    }
}
