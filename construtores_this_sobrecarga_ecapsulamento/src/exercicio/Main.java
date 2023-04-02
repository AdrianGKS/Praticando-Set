package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        ContaBancaria cb;

        System.out.println("Insira o número da conta: ");
        String numConta =  in.nextLine();
        System.out.println("Insira o seu nome: ");
        String nome =  in.nextLine();
        System.out.println("Haverá um depósito inicial (s/n) ?");
        char resposta = in.next().charAt(0);

            if (resposta == 's') {
                System.out.println("Insira o valor do depósito inicial: ");
                double depInicial = in.nextDouble();
                cb = new ContaBancaria(numConta, nome, depInicial);
            } else {
                cb = new ContaBancaria(numConta, nome);
            }
        System.out.println("\nDados da Conta:");
        System.out.println(cb);

        System.out.println("\nInsira um valor de depósito: ");
        cb.deposito(in.nextDouble());

        System.out.println("\nDados Atualizados: ");
        System.out.println(cb);

        System.out.println("\nInsira um valor de saque: ");
        cb.saque(in.nextDouble());

        System.out.println("\nDados Atualizados: ");
        System.out.println(cb);

        in.close();
    }
}
