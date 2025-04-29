public class PilhaDinamica{
       private No inicio;
    

    public void adicionaFinal(int e){
        if(inicio == null){inicio = new No(e);}
        No aux = inicio;
        while(aux.prox != null){
            aux = aux.prox;
        }
        aux.prox = new No(e);
    }
    
    public int removeFinal() throws Exception{
        if(inicio == null){ throw new Exception("ERRO! Lista vazia!");}
        if(inicio.prox == null){
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