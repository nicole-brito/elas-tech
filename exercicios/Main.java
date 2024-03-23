// //Write the Adder class. which should inherit from the class .Calculator, it should implement the method which should calculate and return the sum of two integer parameters, a and b.add(int a, int b)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int i = scan.nextInt();

        // Write your code here.
        //Double d = scan.nextDouble();
        //String s = " ";
//        int i = 2147483647;
//        double d = 235345345345.234534;
//        String s = " fsdfsdf   sdf";

        int i = scan.nextInt();
        Double d = scan.nextDouble();
        String s = scan.next();
        scan.skip(" ");
        String sc = scan.nextLine();
        scan.close();

        System.out.println("String: " + s + " " + sc);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}