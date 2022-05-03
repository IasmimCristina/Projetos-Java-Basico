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
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a alternativa correta da questão " + (i + 1) + ":");
            gabarito[i] = leitura.nextInt();

        }
        // b) Lendo a quantidade de alunos.
        System.out.println("Digite a quantidade de alunos que farão a prova:");
        int qtdAlunos = leitura.nextInt();

        int[][] alunosRespostas = new int[qtdAlunos][5];
        for (int i = 0; i < qtdAlunos; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite a resposta da questão " + (j + 1) + " do estudante " + (i + 1));
                alunosRespostas[i][j] = leitura.nextInt();


            }
        }
        // c) Início da correção das provas de cada aluno. Atribuição da maior e menor nota, além da média.
        double[] notas = new double[qtdAlunos];
        for (int i = 0; i < qtdAlunos; i++) {
            for (int j = 0; j < 5; j++) {
                if (alunosRespostas[i][j] == gabarito[j]) {
                    notas[i] += 2;

                }

            }
        }

        //D) Cálculo da maior e menor nota além da média da snotas.
        double maiorNota, menorNota, media, soma = 0;
        maiorNota = menorNota = notas[0];
        for (int i = 0; i < qtdAlunos; i++) {
            soma += notas[i];
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];

            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];

            }

        }
        media = soma / qtdAlunos; //Média das notas.

        for (int i = 0; i < qtdAlunos; i++) {

            System.out.println("---------------");
            System.out.println("Nota do aluno " + (i + 1) + ": " + notas[i] + ".");
            System.out.println("Média das notas da turma: " + media + ".");
            System.out.println("Maior nota: " + maiorNota + ".");
            System.out.println("Menor nota: " + menorNota + ".");

            System.out.println("---------------");

        }


    }
}
