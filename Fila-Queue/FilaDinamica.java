public class FilaDinamica{
       private No inicio;

    
    public void adicionaFinal(int e){
        if(inicio == null){inicio = new No(e);}
        No aux = inicio;
        while(aux.prox != null){
            aux = aux.prox;
        }
        aux.prox = new No(e);
    }

    public int removeInicio() throws Exception{
        if(inicio == null){ throw new Exception("ERRO! Lista vazia!");}
        int r = inicio.dado;
        inicio = inicio.prox;
        return r;
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