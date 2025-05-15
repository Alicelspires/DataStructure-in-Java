public class TabelaDeEspalhamento{
    private Lista tabela[];
    
    public TabelaDeEspalhamento(int c){
        tabela = new Lista[c];
    }
    
    //função de espalhamento
    public int funcaoEspalhamento(int chave){
        return chave-1;
    }
    
    public boolean remove(int origem, int destino){
        int indice = funcaoEspalhamento(origem);
        if(indice >= 0 && indice < tabela.length){
            if(tabela[indice] != null){
                return tabela[indice].remove(destino);
            } else {
                return false;
            }
        }
        return false;
    }
    
    public void adiciona(int origem, int destino){
        int indice = funcaoEspalhamento(origem);
        if (indice >= 0 && indice <= tabela.length-1 && destino >= 1 && destino <= tabela.length){
            if (tabela[indice] == null){
                tabela[indice] = new Lista();            
            }
            tabela[indice].adiciona(destino);
        } else{
            System.out.println("Vértice Inválido");
        }
    }
    
    public String toString(){
        String s = "";
        for(int i = 0; i < tabela.length; i++){
            if(tabela[i] != null){
                s = s + "Origem: " + (i+1) + " Destinos: " + tabela[i].toString() + "\n";
            } else {
                s = s + "Nó sem destino: " + (i+1);
            }       
        }
        return s;
    }
    
}