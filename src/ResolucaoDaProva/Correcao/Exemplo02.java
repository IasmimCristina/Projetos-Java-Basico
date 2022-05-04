package ResolucaoDaProva.Correcao;

public class Exemplo02 {
    public static void main(String[] args) {
        /*
        b) 1.A declaração da variável i está incorreta, seu tipo não foi informado.
        2. O número 1 está incluído na condição por conta do operador relacional >=, sendo que o código não deveria  fazer isso.
        3. O salto dentro do lço for está incrementando, e não decrementando.

         */


        for (int i = 21; i > 1; i-=2) {

            System.out.println(i);

        }
    }
}
