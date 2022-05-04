package Problema04Palindromo3Digitos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        No intervalo dos números com 3 dígitos disponíveis, quantos palindromos temos?
        Palindromos com três dígitos.
         */
        Scanner leitura = new Scanner(System.in);
        int numero, n1, n2, n3;

        do {
            System.out.println("Digite um número com três digitos:");
            numero = leitura.nextInt();
            n1 = (numero/100)%10;
            n2 = (numero/10)%10;
            n3 = numero%10;

        } while ( numero<100 || numero>=1000 );

        if (n1==n3)
            System.out.println(numero+" é um número palíndromo!");
        else
            System.out.println(numero+" não é um número palíndromo.");


        System.out.println("----Números palíndromos com 3 dígitos----");
        for (int i = 100;i<1000;i++) {
            numero = i;
            n1 = (numero/100)%10;
            n2 = (numero/10)%10;
            n3 = numero%10;
            if (n1==n3)
                System.out.print(" |"+numero+"| ");


        }
        System.out.println(" ");
        System.out.println("-----------------------------------------");




    }



}
