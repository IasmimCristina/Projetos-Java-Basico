package ResolucaoDaProva.Correcao;




public class Exemplo04 {


        int[] geraArray() //A função não deveria retornar void. Agora ela retorna uma array de inteiros.
        {
            int[] b = new int[10];
            int[] result = new int[10];
            for (int i = 0; i < b.length; i++) {

                b[i] = i + 1; //A array recebe a posição + 1 pois a primeira posição de uma array é 0.
                result[i] = b[i]; //Criação da array que será retornada
            }
            return result; // A array esult não havia sido criada.
        }



}
