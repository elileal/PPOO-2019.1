package gof;

public class Visa implements Cartao {

	@Override
	public void getAutorizacao() {
		System.out.println("Autoriza��o: Visa");
	}

	@Override
	public void validaNumero() {
		System.out.println("Valida��o: Visa");
	}

}
