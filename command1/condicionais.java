import java.util.Scanner;

public class condicionais {
    public static void main(String[] args) {
        Scanner condicao = new Scanner(System.in);

        //Solicita a média
        System.out.println("Digite a média do aluno: ");
        double media = condicao.nextDouble();

        //Solicita as faltas
        System.out.println("Digite o número de faltas: ");
        int faltas = condicao.nextInt();

        condicao.nextLine();

        //Solicita o comportamento do aluno
        System.out.println("O aluno obteve uma postura legal? (sim/não) ");

        String respostaPostura = condicao.nextLine().trim().toLowerCase(); //trim() remove espaços em branco. toLowerCase() aceita a resposta se estiver maiúsculo, ou minúsculo.

        boolean postura; //Postura verdadeira ou falsa

        // Uso de operadores lógicos
        // && - E lógico = todas as condições precisam ser lógicas
        // || - ou
        // ! - Não = Inverte o valor bool (ex: !postura significa "postura falsa")

        if (respostaPostura.equals("sim")) {
            postura = true;

        } else if (respostaPostura.equals("não") || respostaPostura.equals("nao")) {
            postura = false;

        } else {
            System.out.println("Entrada inválida para postura. Considerando como 'não'.");
            postura = false;
        }
        String situacao; //Vai analisar a situação do aluno

        if (media >= 5.0 && faltas < 25 && postura) {
            situacao = "Aprovado";

        } else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Recuperação";

        } else if (media < 5.0 && faltas < 25 && !postura) {
            situacao = "Chamar para conversar";

        }else {
            situacao = "Reprovado";
        }
        System.out.println("Situação do aluno: " + situacao + "!");

        condicao.close();

    }

}
