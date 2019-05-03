package gof;

public class CartaoFactory {
	public static Cartao getCartao(Tipo cartao) {
		switch (cartao) {
			case MASTER:
				return new Master();
			case VISA:
				return new Visa();
			case IFCARD:
				return new IFCardAdapter();
			default:
				return null;
		}
	}
}
