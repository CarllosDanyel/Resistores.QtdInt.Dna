import java.util.Scanner;

public class ATV3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int QUANTIDADE = 0;
        int SOMA = 0;
        int MINIMO = 0;
        int MAXIMO = 0;

        while (true) {
            System.out.print("Digite um número inteiro positivo ou negativo ou -1 para sair: ");
            int number = input.nextInt();
           

            if (number == -1) {
                break;
            }

            QUANTIDADE++;
            SOMA += number;

            if (QUANTIDADE == 1) {
                MINIMO = number;
                MAXIMO = number;
            } else {
                if (number > MAXIMO) {
                    MAXIMO = number;
                }
                if (number < MINIMO) {
                    MINIMO = number;
                }
            }
            
        }

        if (QUANTIDADE > 0) {
            double average = (double) SOMA / QUANTIDADE;
            System.out.println("Quantidade de números digitados: " + QUANTIDADE);
            System.out.println("Maior número digitado: " + MAXIMO);
            System.out.println("Menor número digitado: " + MINIMO);
            System.out.println("Média dos números digitados: " + average);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
        input.close();
    }
}
