public class Arvore{
    private No raiz;
    
    public Arvore() {
        raiz = null;
    }

    public void inserir(int e) {
        No novo = new No(e);
        if (raiz == null) {
            raiz = novo;
        } else {
            No aux2 = buscarPai(raiz, raiz, e);
            if (e == aux2.elemento) {
                aux2.ocorrencias++;
                System.out.println("Elemento já existente. Ocorrências: " + aux2.ocorrencias);
            } else {
                if (e < aux2.elemento)
                    aux2.esquerda = novo;
                if (e > aux2.elemento)
                    aux2.direita = novo;
            }
        }
    }
    
    private No buscarPai(No aux1, No aux2, int e) {
        if (aux1 != null && e != aux1.elemento) {
            aux2 = aux1;
            if (e > aux1.elemento)
                return buscarPai(aux1.direita, aux2, e);
            if (e < aux1.elemento)
                return buscarPai(aux1.esquerda, aux2, e);
        }
        return aux2;
    }
    
    public int buscarOcorrencias(int e) {
        No no = buscarNo(raiz, e);
        return (no != null) ? no.ocorrencias : 0;
    }
    
    private No buscarNo(No no, int e) {
        if (no == null || no.elemento == e)
            return no;
        if (e < no.elemento)
            return buscarNo(no.esquerda, e);
        else
            return buscarNo(no.direita, e);
    }
    
    public void exibirEmOrdem() {
        exibirEmOrdem(raiz);
    }
    
    private void exibirEmOrdem(No no) {
        if (no != null) {
            exibirEmOrdem(no.esquerda);
            System.out.println("Elemento: " + no.elemento + " - Ocorrências: " + no.ocorrencias);
            exibirEmOrdem(no.direita);
        }
    }
    
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(80);
        arvore.inserir(50); 
        
        System.out.println("\nElementos na árvore:");
        
        arvore.exibirEmOrdem();
        
        System.out.println("\nOcorrências do número 50: " + arvore.buscarOcorrencias(50));
    }
}