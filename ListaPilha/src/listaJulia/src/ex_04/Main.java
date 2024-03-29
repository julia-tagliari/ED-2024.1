package ex_04;

public class Main {
    public static void main(String[] args) {
        PilhaGenerica pilha = new PilhaGenerica(100);
        String elemento = "Julia";

        pilha.push(2);
        pilha.push('a');
        pilha.push("Julia");

        pilha.removeT(elemento);

    }
}
