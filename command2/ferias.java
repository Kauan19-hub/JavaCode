import java.util.Scanner;
public class Ferias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor_viagem = 3000.00;
        double valor_final = 0.0;

        //Solicita o lugar das férias
        System.out.println("Onde você pretende passar suas férias? ");
        System.out.println("1) Maceió");
        System.out.println("2) Porto de galinhas");
        int destino = scanner.nextInt();

        //Refeição almoço e janta
        System.out.println("Pretende obter o valor do almoço e a janta inclusos? ");
        System.out.println("1) Sim");
        System.out.println("2) Não");
        int refeicao = scanner.nextInt();

        //Cálculo

        //Maceió
        if (destino == 1) {
            if (refeicao == 1) {
                valor_final = valor_viagem + (valor_viagem * 1.00);

            } else if (refeicao == 1) {
                valor_final = valor_viagem + (valor_viagem * 0.85);

            } else {
                System.out.println("Opção de refeição não identificada. Tente novamente! ");

                scanner.close();

            }

            //porto de Galinhas
        } else if (destino == 2) {
            if (refeicao == 1) {
                valor_final = valor_viagem + (valor_viagem * 0.60);

            } else if (refeicao == 2) {
                valor_final = valor_viagem + (valor_viagem * 0.45);

            } else {
                System.out.println("Opção de refeição não identificada. Tente novamente! ");

                scanner.close();
            }

        } else {
            System.out.println("Destino não identificado... KAKAKAKAKAKAK");

            scanner.close();
        }

        //Valor final
        System.out.println("Valor final: " + valor_final);

        scanner.close();

    }

}