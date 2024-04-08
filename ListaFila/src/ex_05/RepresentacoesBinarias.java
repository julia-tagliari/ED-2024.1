package ex_05;

import ex_03.FilaGenerica;

import java.util.function.ToIntBiFunction;

public class RepresentacoesBinarias {
    public boolean representacoesBinarias(int n){
        Fila fila = new Fila(n);
        FilaGenerica result = new FilaGenerica(n);
        int cont = 1;


        for (int i = 0; i <= fila.tamanho - 1; i++){
            fila.insere(cont);
            cont++;
        }

        for (int i = 0; i < n; i++){
           int numero = fila.vetor[i];
           StringBuilder bin = new StringBuilder();
           bin.setLength(0);
           while(numero > 0){
               if (numero % 2 == 0){
                   int resto = numero % 2;
                   bin.insert(0,resto);
                   numero /= 2;
               }
               else{
                   int resto = numero % 2;
                   bin.insert(0,resto);
                   numero /= 2;

               }
           }
            result.insere(bin);
        }

        while(!result.vazia()){
            System.out.print(result.remove() + " ");
        }
        return true;
    }


}
