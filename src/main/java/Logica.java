public class Logica {

    public static String[] reparteString(String entrada) {
        entrada = entrada.toLowerCase().trim();
        return entrada.split(" ");
    }

    public static String analisaPalavra(String entrada) {

        String parteRepetida = new String();
        char letraFinal = entrada.charAt(entrada.length() - 1);

        // Percorrer a palavra de trás para frente a partir da penultima letra procurando por repetição.
        for (int i = (entrada.length() - 2); i > -1; i--) {

            if (letraFinal == entrada.charAt(i)) {
                parteRepetida = entrada.substring(i + 1);
                break;
            }
        }

        // Verificar se a repetição é valida ou apenas letras normais.
        if ((entrada.indexOf(parteRepetida) != entrada.lastIndexOf(parteRepetida))) {
            entrada = entrada.substring(0, entrada.lastIndexOf(parteRepetida));
            return entrada;
        }

        return null;
    }

    public static String definirResposta(String[] palavras, String entrada) {
        int contador = 0;

        for (int i = 0; i < palavras.length; i++) {

            String palavraTratada = analisaPalavra(palavras[i]);

            if (palavraTratada != null) {
                palavras[i] = palavraTratada;
                contador++;
            }
        }

        if (contador == palavras.length) {
            return String.join(" ", palavras);
        } else return entrada;
    }
}
