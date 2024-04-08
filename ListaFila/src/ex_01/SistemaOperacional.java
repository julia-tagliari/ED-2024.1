package ex_01;
import java.util.Scanner;

public class SistemaOperacional {
    private FilaGenerica<Processo> fila = new FilaGenerica<>(3);

    public SistemaOperacional(){
        this.fila = fila;
    }

   public boolean insereProcesso(Processo processo){
        fila.insere(processo);
        if (!fila.vazia()){
            return true;
        }
        else{
            System.out.println("Erro! Elemento não inserido");
            return false;
        }
   }

   public boolean removeProcesso(){
       Object resultado = fila.remove();
        if (resultado != null){
            System.out.println("Elemento removido com sucesso");
            return true;
        }
        else{
            System.out.println("Erro!");
            return false;
       }
   }

   public void imprimeProcessos(){

        while(!fila.vazia()){
            Object result = fila.remove().getId();
            System.out.println(result);
        }
   }

   public void menu(){
        System.out.println("Insira a opção desejada: ");
        System.out.println("1)Inserir elemento");
        System.out.println("2)Remover elemento");
        System.out.println("3)Imprimir processos");
        System.out.println("0) Sair");
   }

}
