package ex_03;

import ex_02.Fila;

public class CombinaEstruturas {
    public boolean pilhaFila(){
        FilaGenerica fila1 = new FilaGenerica<>(4);
        FilaGenerica fila2 = new FilaGenerica<>(4);
        FilaGenerica fila3 = new FilaGenerica<>(4);

        PilhaGenerica pilha = new PilhaGenerica<>(3);

        fila1.insere(1);
        fila1.insere(2);
        fila1.insere(3);

        fila2.insere(4);
        fila2.insere(5);
        fila2.insere(6);

        fila3.insere(7);
        fila3.insere(8);
        fila3.insere(9);

        pilha.push(fila1.vetor);
        pilha.push(fila2.vetor);
        pilha.push(fila3.vetor);


        if (!pilha.vazia()){
            while(!pilha.vazia()){
                System.out.print(pilha.pop() + " ");
            }
            return true;
        }
        else{
            return false;
        }

    }

    public boolean filaPilha(){
        PilhaGenerica p1 = new PilhaGenerica<>(3);
        PilhaGenerica p2 = new PilhaGenerica(3);
        PilhaGenerica p3 = new PilhaGenerica<>(3);

        FilaGenerica fila = new FilaGenerica<>(3);

        p1.push("bola");
        p1.push("carro");
        p1.push("boneca");

        p2.push("azul");
        p2.push("rosa");
        p2.push("amarelo");

        p3.push(1);
        p3.push(2);
        p3.push(3);

        fila.insere(p1.getVetor());
        fila.insere(p2.getVetor());
        fila.insere(p3.getVetor());

        if (!fila.vazia()){
            while(!fila.vazia()){
                System.out.print(fila.remove() + " ");
            }
            return true;
        }
        else{
            return false;
        }
    }


    public boolean filaFila(){
        FilaGenerica f1 = new FilaGenerica<>(3);
        FilaGenerica f2 = new FilaGenerica(3);
        FilaGenerica f3 = new FilaGenerica<>(3);

        FilaGenerica fila = new FilaGenerica<>(3);

        f1.insere("girassol");
        f1.insere("rosa");
        f1.insere("lírio");

        f2.insere('a');
        f2.insere('b');
        f2.insere('c');

        f3.insere(10);
        f3.insere(11);
        f3.insere(12);

        fila.insere(f1.vetor);
        fila.insere(f2.vetor);
        fila.insere(f3.vetor);

        if(!fila.vazia()){
            while(!fila.vazia()){
                System.out.print(fila.remove() + " ");
            }
            return true;
        }
        else {
            return false;
        }

    }

}
