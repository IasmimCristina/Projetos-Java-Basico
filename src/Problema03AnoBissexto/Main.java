package Problema03AnoBissexto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        A cada 4 anos é ano bissexto.
        A cada 100 anos não é ano bissexto.
        A cada 400 anos é ano bissexto.
        Prevalecem as últimas regras sobre as primeiras
         */
        int ano;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um ano:");
        ano = leitura.nextInt();

        if (ano%4==0 ||  (ano%400==0  && ano%100!=0) )
            System.out.println(ano+" é bissexto!");
         else
            System.out.println(ano+" não é bissexto.");



    }
}
