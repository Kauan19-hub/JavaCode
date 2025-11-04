import java.io.StringReader;

public class str_class {
    // Códigos ANSI para as cores da fonte
    public static final String RESET = "\033[0m";      // Resetando as cores
    public static final String VERMELHO = "\033[31m";   // Vermelho
    public static final String VERDE = "\033[32m";      // Verde
    public static final String AMARELO = "\033[33m";    // Amarelo
    public static final String AZUL = "\033[34m";       // Azul
    public static final String ROXO = "\033[35m";       // Roxo
    public static final String CIANO = "\033[36m";      // Ciano
    public static final String BRANCO = "\033[37m";     // Branco

    // Códigos ANSI para as cores de fundo
    public static final String FUNDO_VERMELHO = "\033[41m";   // Fundo Vermelho
    public static final String FUNDO_VERDE = "\033[42m";      // Fundo Verde
    public static final String FUNDO_AMARELO = "\033[43m";    // Fundo Amarelo
    public static final String FUNDO_AZUL = "\033[44m";       // Fundo Azul
    public static final String FUNDO_ROXO = "\033[45m";       // Fundo Roxo
    public static final String FUNDO_CIANO = "\033[46m";      // Fundo Ciano
    public static final String FUNDO_BRANCO = "\033[47m";     // Fundo Branco

    public static void main(String[] args) {

        // Operadores lógicos
        boolean cond1 = true;
        boolean cond2 = false;

        // Saída dos operadores lógicos
        System.out.println("Resultado do operador AND (&&): " + (cond1 && cond2)); // Falso
        System.out.println("Resultado do operador OR (||): " + (cond1 || cond2)); // Verdadeiro
        System.out.println("Resultado do operador NOT (!): " + !cond1); // Falso

        // Operadores de incremento e decremento
        int numero = 10;

        // Incrementando pós-fixado
        numero++;
        System.out.println("Incremento pós-fixado: " + numero); // 11

        //Decremento pós-fixado
        numero--;
        System.out.println("Decretamento pós-fixado: " + numero); // 10

        // Operadores direto na saída console
        System.out.println("Incremento pré-fixado: " + ++numero); // 11
        System.out.println("Decremento pré-fixado: " + --numero); // 10

        // Usando operador ternário
        String resultado = (numero > 5)? "Maior que 5": "Menor ou igual a 5";
        System.out.println("Resultado do operador ternário: " + resultado);

        // Strings
        // String diretamente
        String texto = "Java = Back-End";

        // Método charAt, acessa um caractere específico
        char caractere = texto.charAt(5); // Pega o caractere na posição 5
        System.out.println("Caractere na posição 5: " + caractere);

        // Método startsWith, verifica se a string começa com um prefixo
        boolean comecaComJava = texto.startsWith("Java");
        System.out.println("A string começa com 'Java'? " + comecaComJava); // True

        // Método endsWith, verifica se a string termina com um sufixo
        boolean terminaComEnd = texto.endsWith("End");
        System.out.println("A string termina com 'End'? " + terminaComEnd); // True

        // Criando letras maiúsculas com toUpperCase
        String textoMaiusculo = texto.toUpperCase();
        System.out.println("Texto em maiúsculo: " + textoMaiusculo);

        // Criando letras minúsculas com toLowerCase
        String textoMinusculo = texto.toLowerCase();
        System.out.println("Texto em minúsculo: " + textoMinusculo);
        
        // Usando equal para comparar strings
        String textoComparar = "Java é uma linguagem organizada";
        boolean iguais = textoComparar.equals(textoComparar);
        System.out.println("As duas strings são iguais? " + iguais); // True

          // Usando as cores ANSI para formatar o texto
            System.out.println(VERMELHO + "Texto em Vermelho!" + RESET);
            System.out.println(VERDE + "Texto em Verde!" + RESET);
            System.out.println(AMARELO + "Texto em Amarelo!" + RESET);
            System.out.println(AZUL + "Texto em Azul!" + RESET);
            System.out.println(ROXO + "Texto em Roxo!" + RESET);
            System.out.println(CIANO + "Texto em Ciano!" + RESET);
            System.out.println(BRANCO + "Texto em Branco!" + RESET);

            // Usando cores de fundo
            System.out.println(FUNDO_VERMELHO + "Texto com Fundo Vermelho!" + RESET);
            System.out.println(FUNDO_VERDE + "Texto com Fundo Verde!" + RESET);
            System.out.println(FUNDO_AMARELO + "Texto com Fundo Amarelo!" + RESET);
            System.out.println(FUNDO_AZUL + "Texto com Fundo Azul!" + RESET);
            System.out.println(FUNDO_ROXO + "Texto com Fundo Roxo!" + RESET);
            System.out.println(FUNDO_CIANO + "Texto com Fundo Ciano!" + RESET);
            System.out.println(FUNDO_BRANCO + "Texto com Fundo Branco!" + RESET);

    }
}
