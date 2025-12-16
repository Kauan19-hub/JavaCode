import java.util.Scanner;

public class alternativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pode escolher a pergubnta
        System.out.println("Olá, dev!");
        System.out.println("Temos um quiz com duas perguntas, com 3 alternativas cada. Você prefere responder a 1 ou a 2?" );
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Qual pais localiza-se em 2 continentes, e é o maior país do mundo?");
            System.out.println("1) Brasil");
            System.out.println("2) Alemanha");
            System.out.println("3) Rússia");

            int resposta = scanner.nextInt();

            if (resposta == 3)
                System.out.println("Parabéns! Resposta correta. Você já pode tirar seu prêmio na Shostners n' Shostners.");

            else
                System.out.println("Você não acertou, mas você pode tentar numa próxima. Boa sorte!");

            } else if(escolha == 2) {
            System.out.println("Qual dessas linguagens trabalha com o banco de dados?");
            System.out.println("1) HTML");
            System.out.println("2) PhP");
            System.out.println("3) Vite");

            int resposta = scanner.nextInt();

            if (resposta == 2)
                System.out.println("Parabéns! Resposta correta. Você já pode tirar seu prêmio na Shostners n' Shostners.");

            else
                System.out.println("Você não acertou, mas você pode tentar numa próxima. Boa sorte!");

        } else {
            System.out.println("Opção não identificada. ");

            scanner.close();
        }
    }
}