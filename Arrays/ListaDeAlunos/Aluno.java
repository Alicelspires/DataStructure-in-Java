public class Aluno{
    private String nome;
    private int RA;
    
    Aluno(String nome, int ra){
        this.nome = nome;
        this.RA = ra;
    }
    
    // getters não obrigatorios
    public String getNome(){ return this.nome; }
    public int getRA(){ return this.RA; }
    
    public String toString(){
        return "{nome: " + nome +", RA: "+ RA +"}";
    }
}