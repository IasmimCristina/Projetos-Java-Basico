package ResolucaoDaProva.Correcao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int value = leitura.nextInt();


        switch (value % 2) {

            case 0:
                System.out.println("Inteiro par"); //Se o resto for 0, o número é par, não ímpar.
                break; //O 'break' estava faltando, fazendo com que os dois casos aparecessem quando o resultado era 0.
            case 1:
                System.out.println("Inteiro impar"); //Aqui é o número ímpar, pois houve resto
                break;

        }

    }
}
/*
                1.Não há break para fechar o bloco de cada case.
                2. A mensagem exibida está incorreta, no case 0 o resultado deveria ser par, pois não há resto. No case 1 deveria ser ímpar, pois há resto.

                 */