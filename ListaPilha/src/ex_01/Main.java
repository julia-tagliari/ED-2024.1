package ex_01;

public class Main {
    public static void main(String[] args) {
        String cadeia = "ABABBA C ABBABA";
        VerificaPilha v = new VerificaPilha();

        System.out.println(v.verificaPilha(cadeia));
    }
}
