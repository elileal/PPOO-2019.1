package seguro;

public class Client {
	public static void main(String[] args) {
		Pessoa p = new Pessoa.Builder()
						.nome("val�ria")
						.idade(15)
						.create();
		
		System.out.println(p);
	}
}
