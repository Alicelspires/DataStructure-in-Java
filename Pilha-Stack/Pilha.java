public class Pilha{
    private int dados[];
    private int topo;
    
    Pilha(int capMax){
        dados = new int[capMax];
        topo = -1;
    }
    
    // Verificações
    public boolean vazia(){
        return topo == 0;
    }
    public boolean cheia(){
        return topo == dados.length;
    } 
    
    // Manipulação
    public void adiciona(int e) throws Exception{
        if(cheia()) {throw new Exception("ERRO! Pilha cheia!");}
        else{
            topo++;
            dados[topo] = e;
        }
    }
    public int remove() throws Exception{
        if(vazia()) {throw new Exception("ERRO! Pilha vazia!");}
        else{
            int r = dados[topo];
            topo--;
            return r;
        }
    }
    
    // Mostrar array
    public String toString(){
        String r = "";
        for(int i = 0; i < topo+1;i++){
            r += dados[i]+ " ";
        }
        return r;
    }
    
}