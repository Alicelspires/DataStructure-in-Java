public class ListaDeAlunos{
    private Aluno[] dados;
    private int tam;
    
    ListaDeAlunos(int capMax){
        dados = new Aluno[capMax];
        tam = 0;
    }
    
    // Metodos de afirmação
    public boolean vazia(){ return tam == 0; }
    
    public boolean cheia(){ return tam == dados.length; }
    
    public int obtemTam(){ return tam; }
    
    
    
    // adicionar elementos
    public void adicionaInicio(Aluno e) throws Exception{
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
    
    public void adicionaFinal(Aluno e) throws Exception{
        if(cheia()){
            throw new Exception("ERRO!, lista cheia!");
        } else {
            dados[tam] = e;
            tam++;
        }
    }
    
    public void adiciona(Aluno e, int posicao) throws Exception{
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
    public Aluno removeInicio() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista vazia!");
        } else {
            Aluno r = dados[0];
            for(int i = 1; i < tam;i++){
                dados[i-1] = dados[i];
            }
            tam--;
            return r;
        }
    }
    
    public Aluno removeFinal() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista vazia!");
        } else {
            Aluno r = dados[tam-1];
            tam--;
            return r;
        }
    }
    
    public Aluno remove(int posicao) throws Exception{ // remove por posição
        if(vazia()){
            throw new Exception("ERRO! Lista vazia!");
        } else {
            Aluno r = dados[posicao];
            for(int i = posicao; i < tam; i++){
                dados[i] = dados[i+1];
            }
            tam--;
            return r;
        }
    }
    
    // mostrar elementos
    public Aluno obtemPrimeiro() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista vazia");
        } else {
            return dados[0];
        }
    }
    
    public Aluno obtemUltimo() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista vazia");
        } else {
            return dados[tam-1];
        }
    }
    
    // mostrar lista
    public String toString(){
        String r = "";
        for(int i = 0; i < tam; i++){
            r += dados[i] + "\n";
        }
        return r;
    }
}