package ex_08;
import java.util.*;

public class Subsequencias {

    public static void main(String[] args) {
        //digite os numeros aqui
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        for (int k = 1; k <= n; k++) {
            List<int[]> subsequencias = gerarSubsequencias(array, k);
            int totalPares = 0;
            for (int[] sub : subsequencias) {
                int pares = contarParesUnicos(sub);
                totalPares += pares;
            }
            System.out.printf("Subsequências de tamanho %d: %d pares únicos%n", k, totalPares);
        }
    }

    private static List<int[]> gerarSubsequencias(int[] array, int k) {
        List<int[]> subsequencias = new ArrayList<>();
        PilhaGenerica<Integer> pilha = new PilhaGenerica<>(k);
        gerarSubsequenciasRec(array, 0, k, pilha, subsequencias);
        return subsequencias;
    }

    private static void gerarSubsequenciasRec(int[] array, int i, int k, PilhaGenerica<Integer> pilha, List<int[]> subsequencias) {
        if (pilha.tamanho() == k) {
            int[] sub = new int[k];
            for (int j = 0; j < k; j++) {
                sub[j] = pilha.pop();
            }
            subsequencias.add(sub);
            for (int j = 0; j < k; j++) {
                pilha.push(sub[j]);
            }
            return;
        }
        if (i >= array.length) {
            return;
        }
        pilha.push(array[i]);
        gerarSubsequenciasRec(array, i + 1, k, pilha, subsequencias);
        pilha.pop();
        gerarSubsequenciasRec(array, i + 1, k, pilha, subsequencias);
    }

    private static int contarParesUnicos(int[] array) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int x : array) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }
        return max2 != Integer.MIN_VALUE ? 1 : 0;
    }

}
