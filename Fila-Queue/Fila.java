public class Fila{
    private int dados[];
    private int tam;
    
    Fila(int capMax){
        dados = new int[capMax];
        tam = 0;
    }
    
    // Verificações
    public boolean vazia(){
        return tam == 0;
    }
    public boolean cheia(){
        return tam == dados.length;
    }
    
    // Manipulação
    public void adiciona(int e)throws Exception{
        if(cheia()){throw new Exception("ERRO! Fila cheia!");}
        else{
            dados[tam] = e;
            tam++;
        }
    }
    public int remove()throws Exception{
        if(vazia()){throw new Exception("ERRO! Fila vazia!");}
        else{
            int r = dados[0];
            for(int i = 1; i < tam; i++){
                dados[i-1] = dados[i];
            }
            tam--;
            return r;
        }
    }
    
    // Mostrar arrays
    public String toString(){
        String r = "";
        for(int i = 0; i < tam;i++){
            r += dados[i]+ " ";
        }
        return r;
    }
}