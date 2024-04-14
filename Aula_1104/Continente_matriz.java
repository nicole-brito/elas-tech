public class Continente_matriz {
    private String nomeContinente;
    private String[][] paises = new String[3][];

    /* C0  C1  C2
    L0 BR pop terr
    L1 CL
    L2 UR
    L3 AR
    */

    public Continente_matriz(String nomeContinente, String[][] paises) {
        this.nomeContinente = nomeContinente;
        this.paises = paises;
    }
    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public String[][] getPaises() {
        return paises;
    }

    public void setPaises(String[][] paises) {
        this.paises = paises;
    }

    public void addPais(String[] pais) {
        for (int i = 0; i < paises.length; i++) {
            if (paises[i] == null) {
                paises[i] = pais;
                System.out.println(pais[0] + " adicionado com sucesso!");
                break;
            }
        }
    }

    public int popContinente() {
        int populacao = 0;
        for (String[] pais : paises) {
            populacao += Integer.parseInt(pais[1]);
        }
        return populacao;
    }

    public int maiorTerritorio() {
        int maiorTerritorio = 0;
        int maior = 0;
        for (int i = 0; i < paises.length; i++) {
            if (Integer.parseInt(paises[i][2]) > maiorTerritorio) {
                maiorTerritorio = Integer.parseInt(paises[i][2]);
                maior = i;
            }
        }
        return maior;
    }
    public void mostraMaiorTerr () {
        System.out.println("O país com maior território é: " + paises[maiorTerritorio()][0].toString());
    }

}
