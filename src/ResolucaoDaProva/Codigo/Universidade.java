package ResolucaoDaProva.Codigo;

import java.util.Scanner;

public class Universidade {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //Declaracaoo da quantidade de alunos e arrays com as medias e faltas.
        int qtdAlunos = 20;
        int[] mediaAlunos = new int[qtdAlunos];
        int[] faltas = new int[qtdAlunos];

        //Leitura da média e faltas
        for (int i = 0; i < qtdAlunos; i++) {
            do {
                System.out.println("--------------------------------------------------");
                System.out.println("--------------------Estudante " + (i + 1) + "-------------------");
                System.out.println("Digite a média do " + (i + 1) + "o aluno:");
                mediaAlunos[i] = leitura.nextInt();
                System.out.println("Digite a quantidade de faltas do " + (i + 1) + "o aluno:");
                faltas[i] = leitura.nextInt();
            } while (mediaAlunos[i] > 100 || mediaAlunos[i] < 0 || faltas[i] < 0); //Validacao dos dados inseridos, faltas nao podem ser negativas e as notas devem ser de 0 até 100
        }

        //Exibicao dos alunos aprovados atraves de um metodo com validacao, mensagens diferentes para concicoes diferentes
        if (alunosAprovados(mediaAlunos, faltas) == 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("Infelizmente, nenhum estudante desta turma foi aprovado.");
            System.out.println("--------------------------------------------------");
        } else if (alunosAprovados(mediaAlunos, faltas) == 1) {
            System.out.println("--------------------------------------------------");
            System.out.println("Quantidade de alunos aprovados nessa turma: " + alunosAprovados(mediaAlunos, faltas) + " estudante.");
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("--------------------------------------------------");
            System.out.println("Quantidade de alunos aprovados nessa turma: " + alunosAprovados(mediaAlunos, faltas) + " estudantes!");
            System.out.println("--------------------------------------------------");
        }
    }

    //Metodo que retorna os alunos aprovados
    public static int alunosAprovados(int[] medias, int[] faltas) {
        int aprovados = 0; //A variavel precisa ser inicializada
        //Alunos aprovados com media maior que 70 e sem ter mais de 15 faltas.
        for (int i = 0; i < medias.length; i++) {
            if (medias[i] >= 70 && faltas[i] <= 15) {
                aprovados++; //Aprovados aumenta conforme mais alunos sao aprovados
            }
        }
        return aprovados;
    }
}
