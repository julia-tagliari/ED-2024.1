package ex_02;

public class Fila {
    /* Atributos protected para serem usados na subclasse. */
    protected int tamanho;    /* Tamanho do vetor */
    protected int[] vetor;    /* Vetor de elementos */
    protected int ini;    /* Posicao do proximo elemento a ser retirado */
    protected int n;    /* Numero de elementos na fila */

    public Fila(int tam) {
        tamanho = tam;
        vetor = new int[tamanho];
        ini = 0;
        n = 0;
    }

    public boolean vazia() {
        return (n == 0);
    }

    public boolean cheia() {
        return (n == tamanho);
    }

    //Retiramos o elemento do in�cio da fila
    public int remove() {
        int elemento = Integer.MIN_VALUE;

        if (!this.vazia()) {
            elemento = vetor[ini];
            ini = (ini + 1) % tamanho;
            n--;
        }

        return elemento;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(int elemento) {
        int fim;

        if (!cheia()) {
            fim = (ini + n) % tamanho;
            vetor[fim] = elemento;
            n++;
            return true;
        } else
            return false;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void combinaFilas(Fila f1, Fila f2){
        Fila filaMista = new Fila(f1.tamanho + f2.tamanho);

        while(!f1.vazia() && !f2.vazia()){
            filaMista.insere(f1.remove());
            filaMista.insere(f2.remove());
        }

        for (int i = 0; i <= filaMista.tamanho - 1; i++){
            System.out.print(filaMista.vetor[i] + " ");
        }
    }

}