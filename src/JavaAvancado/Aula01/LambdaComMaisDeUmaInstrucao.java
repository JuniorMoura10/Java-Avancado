package JavaAvancado.Aula01;

public class LambdaComMaisDeUmaInstrucao {

    public static void main(String[] args) {
        Funcao colocarPrefixoSrNaString = valor -> {
            String valorComPrefixo = "Sr. " + valor;
            String valorComPrefixoEPontoFinal = valorComPrefixo + ".";
            return valorComPrefixoEPontoFinal;
        };
        System.out.println();
    }
}
