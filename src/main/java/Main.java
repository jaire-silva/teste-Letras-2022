import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        String resposta;


        System.out.println("Entrada: ");
        entrada = scanner.nextLine();


        // Escreva a sua solução aqui
        try {
            // Um vetor para armazenar a divisão da entrada, caso esta seja uma frase em palavras.
            String[] palavras = Logica.reparteString(entrada);

            resposta = Logica.definirResposta(palavras, entrada);

            System.out.println("\nSaida: ");
            System.out.println(resposta);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Não aceita entrada vazia");
        } finally {
            scanner.close();
        }
    }
}
