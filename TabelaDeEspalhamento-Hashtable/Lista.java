public class Lista{
    private No inicio;
    
    //adiciona elementos em ordem crescente
    public void adiciona(int e){
        if (inicio == null){
            inicio = new No(e);
        } else{
            if (e < inicio.dado){
                //adiciona início
                No novo = new No(e);
                novo.prox=inicio;
                inicio=novo;
            } else{
                No aux = inicio;
                while (aux.prox != null && aux.prox.dado < e){
                    aux = aux.prox;
                }
                if (aux.prox == null){
                    //adicionaFinal
                    aux.prox=new No(e);
                    
                } else{
                    //adiciona no meio da Lista
                    No novo = new No(e);
                    novo.prox = aux.prox;
                    aux.prox = novo;
                }
            }
        }
        
    }
    public boolean remove(int e)  {
        if (inicio == null){
            return false;//lista vazia
        }
        else{
            //O elemento está no primeiro nó
            if(inicio.dado == e){
                inicio = inicio.prox;
                return true;
            }else{
                No aux = inicio;
                while(aux.prox != null && aux.prox.dado != e){
                    aux = aux.prox;
                }
                if (aux.prox==null){
                    return false;
                }
                aux.prox=aux.prox.prox;
                return true;
            }
        }
    }
    public String toString(){
        String s="";
        No aux=inicio;
        while(aux != null){
            s = s + " " + aux.dado;
            aux = aux.prox;
        }
        return s;
    }
}