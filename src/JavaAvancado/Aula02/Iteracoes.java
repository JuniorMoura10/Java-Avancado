package JavaAvancado.Aula02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1, 2, 3, 4, 5,};
//        imprimirNomesFiltrados(nomes);
//        imprimirTodosOsNomes(nomes);
//        imprimirODobroDeCadaItemDaLista(numeros);

        //Utilizando List com Stream
        List<String> profissoes = new ArrayList();
        profissoes.add("Desenvolvedor");
        profissoes.add("QA");
        profissoes.add("Gerente de Projetos");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream().filter(profissao -> profissao.startsWith("Gerente"))
                            .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("João")) {
                nomesParaImprimir += " " + nomes[i];
            }
        }
        System.out.println("Nomes do for: " + nomesParaImprimir);

        String nomesParaImprimirDoStream = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining());
        System.out.println("Nomes do Stream: " + nomesParaImprimirDoStream);
    }

    public static void imprimirTodosOsNomes(String... nomes){
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();
    }


    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros) {
            System.out.print(numero * 2 + " ");
        }

        Stream.of(numeros).map(numero -> numero * 2).forEach(System.out::println);
    }
}
