public class Teste{
	public static void main(String[] args) {
	    TabelaDeEspalhamento te = new TabelaDeEspalhamento(4);
	    te.adiciona(1,2);
	    te.adiciona(1,3);
	    te.adiciona(2,2);
	    te.adiciona(2,3);
	    te.adiciona(3,1);
	    
		System.out.println(te.toString());
		
		te.remove(1, 3);
		
		System.out.println(te.toString());
	}
}
