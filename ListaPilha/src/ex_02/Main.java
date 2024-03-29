package ex_02;

public class Main {
    public static void main(String[] args) {
        String cadeia = "ABBABA C ABABBA D ABBABA C ABABBA D ABABBA C ABABBA";
        VerificaPilha palindromo = new VerificaPilha();
        palindromo.verificaPilha(cadeia);

        VerificaForma formato = new VerificaForma();

        if (palindromo.verificaPilha(cadeia)){
            formato.verificaForma(cadeia);
            System.out.println(formato.verificaForma(cadeia));
        }
        else{
            System.out.println(formato.verificaForma(cadeia));
        }

    }
}
