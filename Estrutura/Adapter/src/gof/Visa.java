package gof;

public class Visa implements Cartao {

	@Override
	public void getAutorizacao() {
		System.out.println("Autorização: Visa");
	}

	@Override
	public void validaNumero() {
		System.out.println("Validação: Visa");
	}

}
