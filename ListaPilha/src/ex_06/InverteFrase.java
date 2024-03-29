package ex_06;
public class InverteFrase {
    public void inverteFrase(String a){
        PilhaGenerica pilha = new PilhaGenerica(a.length());
        String frase = "";
        String resultado = "";

        for (int i = 0; i <= a.length() - 1; i++){
            pilha.push(a.charAt(i));
        }

        for (int i = 0; i <= a.length() - 1; i++){
            frase += pilha.pop();
        }

        String[] palavras = frase.split("\\s+");

        for (int i = palavras.length - 1; i >= 0; i--){
            resultado += palavras[i] + " ";
        }

        System.out.println(resultado);

    }

}
