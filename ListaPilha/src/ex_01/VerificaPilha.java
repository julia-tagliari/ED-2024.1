package ex_01;

public class VerificaPilha {

    public boolean verificaPilha(String cadeia){
       PilhaGenerica pilha = new PilhaGenerica<>(cadeia.length());
       PilhaGenerica aux = new PilhaGenerica<>(cadeia.length());
       String a = " ", b = " ";

       for (int i = 0; i <= cadeia.length() - 1; i++){
           if (cadeia.charAt(i) != 'C') {
               pilha.push(cadeia.charAt(i));
           }
           else if (cadeia.charAt(i) == ' '){
               pilha.pop();
           }
           else{
               break;
           }

       }

       for (int i = cadeia.length() - 1; i>= 0; i--){
           if (cadeia.charAt(i) == 'C'){
               break;
           }
           else if(cadeia.charAt(i) == ' '){
               pilha.pop();
           }
           else{
               aux.push(cadeia.charAt(i));
           }
       }

       while(!pilha.vazia()){
           a += pilha.pop();
       }
       while(!aux.vazia()){
           b += aux.pop();
       }

       if (a.equals(b)){
           return true;
       }
       else{
           return false;
       }

    }
}
