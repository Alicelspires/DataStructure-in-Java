public class ListaLigada{
    private No inicio;
    
    ListaLigada(){
        this.inicio = null;
    }
    
    // adicionas
    public void adicionaInicio(int e){
        No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
    }
    
    public void adicionaFinal(int e){
        if(inicio == null){inicio = new No(e);
        } else {
            No aux = inicio;
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = new No(e);
        }
    }
    
    // exclui
    public int removeInicio() throws Exception {
        if(inicio == null) { 
            throw new Exception("ERRO! Lista vazia!");
        }
        int r = inicio.dado;
        inicio = inicio.prox;
        return r;
    }
    
    public int removeFinal() throws Exception{
        if(inicio == null){ throw new Exception("ERRO! Lista vazia!");}
        else if(inicio.prox == null){
            int r = inicio.dado;
            inicio = null;
            return r;
        } else {
            No aux = inicio;
            while(aux.prox.prox != null){
                aux = aux.prox;
            }
            int r = aux.prox.dado;
            aux.prox = null;
            return r;
        }
    }

    // mostra
    public String toString(){
        String r = "";
     No aux = inicio;
     while (aux != null) {
         r += " " + aux.dado;
         aux = aux.prox;
     }
     return r;
     }
    
    
}