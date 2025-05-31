public class Arvore{
    private No raiz;
    
    public Arvore(){
        raiz = null;
    }
    
    // Metodos de busca de nos ----------------------------
    
    private No buscaPai(No raiz, No raiz2 ,int e){
        if(raiz != null && e != raiz.elemento){
            raiz2 = raiz;
            if(e < raiz.elemento){
                return buscaPai(raiz.esquerda, raiz2, e);
            } else {
                return buscaPai(raiz.direita, raiz2, e);
            }
        }
        return raiz2;
    }
    
    private No buscarNo(No no, int valor) {
        if (no == null) {
            return null;
        }
        
        if (valor < no.elemento) {
            return buscarNo(no.esquerda, valor);
        } else if (valor > no.elemento) {
            return buscarNo(no.direita, valor);
        } else {
            return no; // Nó encontrado
        }
    }
    public String buscar(int valor){
        No node = buscarNo(raiz, valor);
        if(node != null){
            return "Valor encontrado: " + valor;
        } else {
            return "Valor não encontrado";
        }
    }
    
    // Metodos de manipulação de dados -------------------
    
    // Inserir nó
    public void inserir(int e){
        No novoNo = new No(e);
        if(raiz == null){
            this.raiz = novoNo;
        } else {
            No aux = buscaPai(raiz, raiz, e);
            if(e == raiz.elemento){
                System.out.println("Valor já existente");
            }
            if(e < aux.elemento){
                aux.esquerda = novoNo;
            } else if(e > aux.elemento) {
                aux.direita = novoNo;
            }
        }
    }
    
    // Deletar nó
    public void deletar(int valor){
        raiz = deletar(raiz, valor);
    }
    private No deletar(No no, int valor){
        if(no == null) return null;
    
        if(valor < no.elemento){
            no.esquerda = deletar(no.esquerda, valor);
        } else if(valor > no.elemento){
            no.direita = deletar(no.direita, valor);
        } else {
            if (no.direita == null) {
                return no.esquerda;
            }
            
            No sucessor = encontrarSucessor(no.direita);
            no.elemento = sucessor.elemento;
            no.direita = deletar(no.direita, sucessor.elemento);
        }
    
        return no;
    }
    private No encontrarSucessor(No no) {
        if(no.direita.esquerda == null) return no;
        No atual = no;
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }
    
    // Em Ordem -----------------------------------
    public void emOrdem(){
        emOrdem(raiz);
    }
    private void emOrdem(No no){
        if(no != null){
            emOrdem(no.esquerda);
            System.out.print(no.elemento + " ");
            emOrdem(no.direita);
        }
    }
    
    // Em Pré-Ordem --------------------------------
    public void emPreOrdem(){
        emPreOrdem(raiz);
    }
    private void emPreOrdem(No no){
        if(no != null){
            System.out.print(no.elemento + " ");
            emPreOrdem(no.esquerda);
            emPreOrdem(no.direita);
        }
    }
    
    // Em Pos-Ordem --------------------------------
    public void emPosOrdem(){
        emPosOrdem(raiz);
    }
    private void emPosOrdem(No no){
        if(no != null){
            emPosOrdem(no.esquerda);
            emPosOrdem(no.direita);
            System.out.print(no.elemento + " ");
        }
    }
}