package JavaAvancado.Aula02;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto ->
                new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringEmInteiro = texto ->
                Integer.valueOf(texto);
        System.out.println(retornaNomeAoContrario.apply("junior"));
        System.out.println(converterStringEmInteiro.apply("50"));
    }
}
