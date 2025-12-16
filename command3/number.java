import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //Gerar o número dentro de um intervalo de 1 a 100
        int minimo = 1;
        int maximo = 100;

        //Sorteia um número dentro do intervalo
        int numero = random.nextInt(maximo - minimo + 1) + minimo;

        //Solicita o número
        System.out.println("Adivinhe o número dentro do intervalo: ");

        //O Java vai ler o número que foi digitado
        int opiniao = scanner.nextInt();

        //Verifica e retorna se está certo ou não
        if (opiniao == numero) {
            System.out.println("Você acertou!");

        } else {
            System.out.println("Você errou. O número é " + numero);
        }

        scanner.close();
    }
}
