package ex_03;
public class DuasPilhas {
    public boolean duasPilhas(String a, String b){
        PilhaGenerica primeiraPilha = new PilhaGenerica<>(a.length());
        PilhaGenerica segundaPilha = new PilhaGenerica<>(b.length());
        char[] vetor = new char[a.length() + b.length()];

        for (int i = 0; i <= a.length() - 1; i++){
            primeiraPilha.push(a.charAt(i));
        }

        for (int i = 0; i <= b.length() - 1; i++){
            segundaPilha.push(b.charAt(i));
        }

        for (int i = 0; i <= vetor.length - 1; i++){
            if (primeiraPilha.vazia()){
                break;
            }
            else{
                vetor[i] = (char) primeiraPilha.pop();
            }

        }

        for (int i = vetor.length - 1; i >= 0; i--){
            if (segundaPilha.vazia()){
                break;
            }
            else{
                vetor[i] = (char) segundaPilha.pop();
            }
        }

        if (true){
            System.out.println("Processo realizado com sucesso");
            return true;
        }
        else{
            System.out.println("Erro");
            return false;
        }

    }

}
