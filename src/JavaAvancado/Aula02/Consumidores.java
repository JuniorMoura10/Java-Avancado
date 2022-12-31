package JavaAvancado.Aula02;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //Method rReference
        //apenas utilizar o parâmetro da forma como ele foi recebido

        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello, Júnior");
        imprimirUmaFrase2.accept("Hello, Moura");

    }
}
