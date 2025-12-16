import java.util.Scanner;

public class idade{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Solicita a idade
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            String classificacao = ""; //Analisa a variável "SITUAÇÃO"

            //Classificação
            if (idade >= 0 && idade <= 14) {
                classificacao = "Criança";

            } else if (idade >= 12 && idade < 18) {
                classificacao = "Adolescente";

            } else if (idade >= 18 && idade < 30) {
                classificacao = "Adulto jovem";

            } else if (idade >= 30) {
                classificacao = "Adulto";

            } else {
                classificacao = "Idade não reconhecida. Tente novamente!"; //Se a idade for menor que zero, ela não será reconhecida
            }

            //Exibe a idade
            System.out.println("Sua classificação: " + classificacao);

        }
    }