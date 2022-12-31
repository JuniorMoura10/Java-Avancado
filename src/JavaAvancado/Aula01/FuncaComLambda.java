package JavaAvancado.Aula01;

public class FuncaComLambda {

    public static void main(String[] args) {
        // Código mais limpoe e de fácil leitura utilizando lambda
        Funcao colocarPrefixoSrNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSrNaString.gerar("João"));
    }
}
