package JavaAvancado;

import JavaAvancado.Aula01.Funcao;

public class Main{

    public static void main(String[] args) {
        Funcao colocarPrefixoSrNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSrNaString.gerar("João"));
    }
}
