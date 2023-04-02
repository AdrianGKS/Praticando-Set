package Pensionato.main;

import Pensionato.main.entities.Cadastro;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in =  new Scanner(System.in);

        Cadastro[] vect = new Cadastro[10];

        System.out.println("Quantos estudantes irão alugar? ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.println("Reserva #" + (i+1));
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Email: ");
            String email = in.nextLine();
            System.out.print("Quarto: ");
            int quarto = in.nextInt();
            vect[quarto] = new Cadastro(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] !=  null)
                System.out.println(i + ": " + vect[i]);
        }
        in.close();
    }
}
