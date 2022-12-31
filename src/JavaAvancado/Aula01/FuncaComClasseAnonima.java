package JavaAvancado.Aula01;

public class FuncaComClasseAnonima {

    public static void main(String[] args) {
        // Código mais verboso e confuso utilizando classe anônima
        Funcao colocarPrefixoSrNaString = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. " + valor;
            }
        };
        System.out.println(colocarPrefixoSrNaString.gerar("João"));
    }
}
