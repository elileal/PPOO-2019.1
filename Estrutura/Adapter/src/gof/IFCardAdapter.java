package gof;

public class IFCardAdapter implements Cartao{
	private IFCard cartao;
	
	public IFCardAdapter() {
		this.cartao = new IFCard();
	}

	@Override
	public void getAutorizacao() {
		this.cartao.autorizacao();
	}

	@Override
	public void validaNumero() {
		this.cartao.validacao();
	}

}
