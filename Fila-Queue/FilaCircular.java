public class FilaCircular{
    private int dados[];
    private int tam;
    private int ini;
    private int fim;
    
    FilaCircular(int capMax){
        dados = new int[capMax];
        tam = 0;
        fim = 0;
        ini = 0;
    }
    
    // Verificações
    public boolean vazia(){
        return tam == 0;
    }
    public boolean cheia(){
        return tam == dados.length;
    }
    
    // Manipulação
    public void adiciona(int e) throws Exception{
        if(cheia()){ throw new Exception("ERRO! Fila cheia!");}
        else{
            dados[fim] = e;
            tam++;
            fim = (fim+1)%dados.length; // sempre dara o valor de fim+1 a não ser que "fim" seja igual o tamanho inteiro do vetor, então será reiniciado em 0'
        }
    }
    public int remove() throws Exception {
        if(vazia()){ throw new Exception("ERRO! Fila vazia!");}
        else{
            int r = dados[ini];
            tam--;
            ini=(ini+1)%dados.length;
            return r;
        }
    }
    
    // Mostrar array
    public String toString(){
        String r = "";
        int i = ini;
        
        for(int c = 1; c <= tam; c++){
            r += dados[i] + " ";
            i = (i+1)%dados.length;
        }
        return r;
    }
}