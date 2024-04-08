package ex_04;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(3);
        FilaDupla filaDupla = new FilaDupla(fila.tamanho);

        fila.insere(1);
        fila.insere(2);
        fila.insere(3);

       filaDupla =  Fila.converteFila(fila);
       System.out.println(filaDupla.removeFim());

    }

}
