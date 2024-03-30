package ex_05;

public class Balanceamento {
    public boolean balanceamento(String a){
        PilhaGenerica pilha = new PilhaGenerica<>(a.length());
        boolean verificacao = false;

        for (int i = 0; i <= a.length() - 1; i++){
            if(a.charAt(i) == '[' || a.charAt(i) == '{' || a.charAt(i) == '('){
                pilha.push(a.charAt(i));
            }
        }

        for (int i = 0; i <= a.length() - 1; i++){
            if (a.charAt(i) == ']'){
                if ((char) pilha.pop() == '['){
                    verificacao = true;
                }
                else if(a.charAt(i) == '}'){
                    if ((char) pilha.pop() == '{'){
                        verificacao = true;
                    }
                }
                else if(a.charAt(i) == ')'){
                    if ((char) pilha.pop() == '('){
                        verificacao = true;
                    }
                }
            }
        }

        if (verificacao){
            System.out.println("Está balanceado");
            return verificacao;
        }
        else{
            System.out.println("Não está balanceado");
            return verificacao;
        }
    }



}
