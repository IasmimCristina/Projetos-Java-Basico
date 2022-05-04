package Problema05NotaAlunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Imprima a lista dos alunos que obtiveram a maior nota e a lista dos alunos que obtiveram a menor nota.
         */
        Scanner leitura = new Scanner(System.in);
        int qtdAlunos;
        System.out.println("Quantidade de alunos:");
        qtdAlunos = leitura.nextInt();

        String[] nomes = new String[qtdAlunos];
        double[] notas = new double[qtdAlunos];
        for (int i =0; i<qtdAlunos; i++) {
            System.out.println("Digite o nome do estudante "+(i+1)+":");
            nomes[i] = leitura.next();
            System.out.println("Digite a nota do estudante "+(i+1)+":");
            notas[i] = leitura.nextInt();

        }
        //Em progresso...
    }
}
