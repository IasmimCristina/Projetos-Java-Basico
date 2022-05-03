package Problema01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Processo seletivo. Aplicação de uma prova. Há um gabarito que deve ser lido.
        A prova tem 5 questões com 5 alternativas.
         */

        Scanner leitura = new Scanner(System.in);

        int[] gabarito = new int[5];
        // a) Lendo o gabarito oficial com as repsoastas das 5 questões.
        for (int i = 0;i< 5;i++) {
            System.out.println("Digite a alternativa correta da questão "+ (i+1)+":");
            gabarito[i] = leitura.nextInt();

        }
        // b) Lendo a quantidade de alunos.
        System.out.println("Digite a quantidade de alunos que farão a prova:");
        int qtdAlunos = leitura.nextInt();

        // c) Início da correção das provas de cada aluno.
        int[][] alunosRespostas = new int[qtdAlunos][5];
        for (int i = 0 ;i<qtdAlunos; i++) {
            for (int j = 0; j<5;j++) {
                System.out.println("Digite a resposta da questão "+(j+1)+" do estudante "+(i+1));
                alunosRespostas[i][j] = leitura.nextInt();

            }
        }

        


    }
}
