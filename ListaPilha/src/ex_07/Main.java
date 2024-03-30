package ex_07;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Expressao ex = new Expressao();
        String expressao = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        try {
            double resultado = ex.avaliarExpressao(expressao);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
