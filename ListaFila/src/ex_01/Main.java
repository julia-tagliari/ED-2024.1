package ex_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SistemaOperacional sistema = new SistemaOperacional();
        Processo p1 = new Processo(1);
        Processo p2 = new Processo(2);
        Processo p3 = new Processo(3);
        int opcao;

        do {
            sistema.menu();
            opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    sistema.insereProcesso(p1);
                    sistema.insereProcesso(p2);
                    sistema.insereProcesso(p3);
                    break;
                case 2:
                    sistema.removeProcesso();
                    break;
                case 3:
                    sistema.imprimeProcessos();
                    break;
            }

        }while(opcao != 0);


    }



}
