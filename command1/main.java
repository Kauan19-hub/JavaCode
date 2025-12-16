// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)

import java.util.Scanner;

public class main {
    public main() {
        
    }

    public static void main(String[] args) {
        Scanner ratata = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Digite um número positivo (ou um número negativo para sair): ");
            numero = ratata.nextInt();
            if (numero >= 0) {
                System.out.println("Você digitou: " + numero);
            }
        } while(numero >= 0);

        System.out.println("Número negativo detectado. Saindo....");
        ratata.close();
    }
}
