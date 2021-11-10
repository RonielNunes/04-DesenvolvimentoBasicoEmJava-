package one.digitalinovation.tipos.tipagem;

public class TipoInferido {
    public static void main(String[] args) {
        var numero = Integer.valueOf("123454");
        var texto = "O numero e: ";
        //Criar variáveis e determinar seu tipo apartir
        // do conteúdo que estará recebendo
        System.out.println(texto + numero);
    }
}
