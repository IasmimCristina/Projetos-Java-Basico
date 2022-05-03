package Problema02Palindromo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Solicite um número inteiro.
        Cheque se é palíndromo (sequência idêntica tando da esquerda para direita quanto o contrário)
         */
        Scanner leitura = new Scanner(System.in);
        int numero, n1, n2, n3, n4, n5;

        System.out.println("Digite um número de 5 dígitos:");
        numero = leitura.nextInt();

        //Usaremos o exemplo 12345 para os comentários.
        //A divisão por dez apenas move a vírgula. Vamos movô-la em cada charactere para que tenhamos o resto da divisão desejado.
        n1 =(numero/10000)%10; //O resultado da divisão de 12345 / 10000 = 1,2345(somente 1 nesse caso, pois utilizamos a categoria de dado inteiro). E o resto da divisão de 1 por 10 = 1
        n2 = (numero/1000)%10; //O resto da divisão de 12345 por 1000 = 345    O resultado da divisão de 12345 / 1000 = 12,345. Porém, lembre-se de que lidamos com números inteiros.
        n3 = (numero/100)%10;
        n4 = (numero/10)%10;
        n5 = numero%10;

        if (n1==n5 && n2==n4)
            System.out.println(numero+" é palíndromo!");
        else
            System.out.println(numero+" não é palíndromo.");
        //Não precisávamos do n3, mas ele ficou para manter a lógica clara.










    }
}
