package gof;

public class Client {
	public static void main(String[] args) {
		Jogador j1 = new Jogador("Primeiro");
		j1.add("água");
		j1.add("fogo");
		j1.add("gelo");
		j1.add("ventania");		
				
		Jogador j2 = j1.clone();
		j2.add("Pensamento");		
		
		System.out.println(j1);
		System.out.println(j2);
	}
}
