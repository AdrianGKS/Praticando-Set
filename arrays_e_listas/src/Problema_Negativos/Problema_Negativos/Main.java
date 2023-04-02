package Problema_Negativos.Problema_Negativos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n =  in.nextInt();
        
        Integer[] vect = new Integer[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = in.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0)
                System.out.println(vect[i]);
        }
    }
}
