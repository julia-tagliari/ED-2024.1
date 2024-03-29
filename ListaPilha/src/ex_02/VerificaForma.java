package ex_02;
public class VerificaForma {
    public boolean verificaForma(String cadeia){
        PilhaGenerica pilha = new PilhaGenerica<>(cadeia.length());
        PilhaGenerica aux = new PilhaGenerica<>(cadeia.length());
        String a = " ";
        String b = " ";

        for (int i = 0; i <= cadeia.length() - 1; i++){
            if (cadeia.charAt(i) == 'D'){
                break;
            }
            else{
                pilha.push(cadeia.charAt(i));
            }
        }

        for (int i = cadeia.length() - 1; i >= 0; i--){
            if (cadeia.charAt(i) == 'D'){
                break;
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
