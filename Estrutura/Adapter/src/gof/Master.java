package gof;

public class Master implements Cartao{

	@Override
	public void getAutorizacao() {
		System.out.println("Autorização: Master");
	}

	@Override
	public void validaNumero() {
		System.out.println("Validação: Master");
	}

}
