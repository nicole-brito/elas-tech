import java.security.SecureRandom;
import java.util.Arrays;

public class Matriz_treino {
    public static void main(String[] args) {

        final int paises = 3;
        final int detalhes = 5;

        int[][] indice = new int[paises][detalhes];

            //0       1    2
//     0   ["Brasil"][343][4543]
//     1   ["Paraguai"][343][4543]
//     2   ["Uruguai"][343][4543]
//     3   ["Argentina"][343][4543]

        // [0][0], [0][1]

        for (int i = 0; i < paises; i++) {
            for (int j = 0; j < detalhes; j++) {
                indice[i][j] = new SecureRandom().nextInt(100);
            }
        }

        for (int i = 0; i < paises; i++) {
            for (int j = 0; j < detalhes; j++) {
                //System.out.printf("%d | ", indice[i][j]);
            }

            //System.out.printf("%n");
        }

        for (int[] n : indice) {
            for (int v : n) {
                //System.out.printf("%2d | ", v);
            }
            //System.out.printf("%n");
        }

        int[][] num = {{1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}, {100, 200, 300, 400, 500}};

        for (int[] n : num) { 
            for (int v : n) {
                //System.out.printf("%3d | ", v);
            }
            //System.out.printf("%n");
        }


        String[][] paisesAmerica = {{"Brasil", "3235", "4542"}, {"Argentina", "953", "8946"}, {"Uruguai", "34232", "87675"}};

        for (String[] n : paisesAmerica) {
            for (String v : n) {
                //System.out.printf(v + " | ");
            }
            //System.out.printf("%n");
        }


        for (int i = 0; i < paisesAmerica.length; i++) {
            if (paisesAmerica.length >= 0) {
                for (int j = 0; j < i; j++) {
                    System.out.printf(" | ", paisesAmerica[i][j]);
                }

                System.out.printf("%n");
            }
        }


        }

    }

