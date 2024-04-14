import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int valor_contador;

        System.out.println("Digite o valor inicial do contador: ");
        valor_contador = sc.nextInt();

        Contador contador = new Contador(valor_contador);

        System.out.println("Valor do contador: " + contador.getN());

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        System.out.println("Novo valor do contador: " + contador.getN());

        contador.zerar();

        System.out.println("Valor do contador após zerar: " + contador.getN());


        Continente continente = new Continente("América do Sul");

        Pais arg = new Pais(
                "Argentina",
                45196000,
                2766890
        );

        Pais bol = new Pais(
                "Bolívia",
                11673000,
                1098580
        );

        Pais bra = new Pais(
                "Brasil",
                212559417,
                8515767
        );

        Pais chi = new Pais(
                "Chile",
                19116201,
                756102
        );

        Pais col = new Pais(
                "Colômbia",
                50882891,
                1141748
        );

        Pais equ = new Pais(
                "Equador",
                17643054,
                283561
        );

        Pais gui = new Pais(
                "Guiana",
                786552,
                214969
        );

        Pais par = new Pais(
                "Paraguai",
                7132538,
                406752
        );

        Pais per = new Pais(
                "Peru",
                32971854,
                1285216
        );

        Pais sur = new Pais(
                "Suriname",
                586632,
                163820
        );

        Pais uru = new Pais(
                "Uruguai",
                3473730,
                176215
        );

        Pais ven = new Pais(
                "Venezuela",
                28435943,
                916445
        );

        System.out.println("Adicionando países...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        continente.addPais(arg);
        continente.addPais(bol);
        continente.addPais(bra);
        continente.addPais(chi);
        continente.addPais(col);
        continente.addPais(equ);
        continente.addPais(gui);
        continente.addPais(par);
        continente.addPais(per);
        continente.addPais(sur);
        continente.addPais(uru);
        continente.addPais(ven);

        //Por que isso retorna null?
        System.out.println("\nInformações sobre " + continente.getNomeContinente() + ":\n");

        System.out.println("População total do continente: " + continente.popContinente() + " habitantes");
        System.out.println("Território total do continente: " + continente.terContinente() + " km²");
        System.out.println("Densidade populacional do continente: " + continente.densidadePopContinente() + " hab/km²");

        continente.mostraMenorPais();
        continente.mostraMaiorPais();
        continente.mostraMenorPopulacao();
        continente.mostraMaiorPopulacao();
        continente.razaoTerritorial();

    }
}
