package tradicional;

public class Client {
	public static void main(String[] args) {
		Pessoa p = new PessoaBuilder()
						.nome("Val�ria")
						.idade(15)
						.create();
		
		System.out.println(p);
	}
}
