package ex_02;

import ex_03.FilaGenerica;

public class Main {
    public static void main(String[] args) {
        Fila f1 = new Fila(3);
        Fila f2 = new Fila(3);
        Fila filaMista = new Fila(f1.tamanho + f2.tamanho);

        f1.insere(1);
        f1.insere(2);
        f1.insere(3);

        f2.insere(4);
        f2.insere(5);
        f2.insere(6);

        filaMista.combinaFilas(f1, f2);

    }



}
