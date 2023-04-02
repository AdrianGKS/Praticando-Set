package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = in.nextInt();
        double[] vet = new double[n];
        double soma = 0;
        double media = 0;

            for (int i = 0; i < vet.length; i++) {
                System.out.print("Digite um numero: ");
                vet[i] = in.nextInt();
                soma += vet[i];
            }

        System.out.print("VALORES = ");

            for (int i = 0; i < vet.length; i++)
                System.out.print(vet[i] + " ");

        System.out.println("\nSOMA = " + soma);
        System.out.println("MEDIA = " + (media = soma / n));


    }
}
