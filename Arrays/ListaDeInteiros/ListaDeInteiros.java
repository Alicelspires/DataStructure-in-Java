public class ListaDeInteiros{
    private int dados[];
    private int tam;
    
    ListaDeInteiros(int capMax){
        dados = new int[capMax];
        tam = 0;
    }
    
    // Metodos de afirmação
    public boolean vazia(){
        return tam == 0;
    }
    
    public boolean cheia(){
        return tam == dados.length;
    }
    
    // adicionar elementos
    public void adicionaInicio(int e) throws Exception{
        if(cheia()){
            throw new Exception("ERRO! Lista cheia!");
        } else {
            for(int i = tam; i > 0; i--){
                dados[i] = dados[i-1];
            }
            dados[0] = e;
            tam++;
        }
    }
    
    public void adicionaFinal(int e) throws Exception{
        if(cheia()){
            throw new Exception("ERRO!, lista cheia!");
        } else {
            dados[tam] = e;
            tam++;
        }
    }
    
    public void adiciona(int e, int posicao) throws Exception{
        if(cheia()){
            throw new Exception("ERRO! Lista cheia!");
        } else {
            for(int i = tam; i > posicao; i--){
                dados[i] = dados[i-1];
            }
            dados[posicao] = e;
            tam++;
        }
    }
    
    // remover elementos
    public int removeInicio() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista vazia!");
        } else {
            int r = dados[0];
            for(int i = 1; i < tam;i++){
                dados[i-1] = dados[i];
            }
            tam--;
            return r;
        }
    }
    
    public int removeFinal() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista vazia!");
        } else {
            int r = dados[tam-1];
            tam--;
            return r;
        }
    }
    
    public int remove(int posicao) throws Exception{ // remove por posição
        if(vazia()){
            throw new Exception("ERRO! Lista vazia!");
        } else {
            int r = dados[posicao];
            for(int i = posicao; i < tam; i++){
                dados[i] = dados[i+1];
            }
            tam--;
            return r;
        }
    }
    
    // mostrar elementos
    public int obtemPrimeiro() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista vazia");
        } else {
            return dados[0];
        }
    }
    
    public int obtemUltimo() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista vazia");
        } else {
            return dados[tam-1];
        }
    }
    
    public int obtemTam(){
        return tam;
    }
    
    // mostrar lista
    public String toString(){
        String r = "";
        for(int i = 0; i < tam; i++){
            r += dados[i] + " ";
        }
        return r;
    }
}