package ex_04;
import java.util.Vector;

public class PilhaGenerica<T>
{
    private int n;
    private Vector<T> vetor;
    private int topo;

    public PilhaGenerica(int tamanho)
    {
        n = tamanho;
        vetor = new Vector<T>(tamanho);
        topo = -1;
    }

    public boolean vazia()
    {
        return topo == -1 ? true : false;
    }

    public boolean cheia()
    {
        return topo == n - 1 ? true : false;
    }

    public T pop()
    {
        T elemento;

        if (!this.vazia())
        {
            elemento = vetor.get(topo--);
            return elemento;
        }
        else
        {
            //Impress�o para fins did�ticos
            System.out.println("Pilha vazia: pop nao funcionou.");
            return null;
        }
    }

    public boolean push(T elemento)
    {
        if (!this.cheia())
        {
            vetor.add(++topo, elemento);
            return true;
        }
        else
        {
            //Impress�o para fins did�ticos
            System.out.println("Pilha cheia: push nao funcionou.\n");
            return false;
        }
    }

    public boolean retornaTopo(T elemento)
    {
        if(!this.vazia()){
            elemento = vetor.get(topo);
            return true;
        }
        else
            return false;
    }

    public boolean removeT(PilhaGenerica<T> pilha, T elemento){
        PilhaGenerica auxiliar = new PilhaGenerica(n);
        T elementoRemovido = null;

        while(!pilha.vazia()){
            T atual = pilha.pop();

            if (elemento == atual){
                elementoRemovido = atual;
            }
            else{
                auxiliar.push(atual);
            }
        }

        while(!auxiliar.vazia()){
            pilha.push((T) auxiliar.pop());
        }

        if (elementoRemovido != null){
            System.out.println("Elemento removido com sucesso: " + elemento);
            while(!pilha.vazia()){
                System.out.print(pilha.pop() + " ");
            }
            return true;
        }
        else{
            System.out.println("Elemento não encontrado");
            return false;
        }
    }

}
