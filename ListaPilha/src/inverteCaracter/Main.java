package inverteCaracter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a cadeia de caracter: ");
        String cadeia = entrada.nextLine();

        PilhaGenerica pilha = new PilhaGenerica<>(cadeia.length());

        for (int i = 0; i <= cadeia.length() - 1; i++){
            pilha.push(cadeia.charAt(i));
        }

        while(!pilha.vazia()){
            System.out.print(pilha.pop());
        }
    }
}
