package gof;

public class Master implements Cartao{

	@Override
	public void getAutorizacao() {
		System.out.println("Autoriza��o: Master");
	}

	@Override
	public void validaNumero() {
		System.out.println("Valida��o: Master");
	}

}
