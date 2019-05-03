package gof;

public class Client {
	public static void main(String[] args) {
		CartaoFactory.getCartao(Tipo.MASTER).getAutorizacao();
		CartaoFactory.getCartao(Tipo.VISA).validaNumero();
		
		CartaoFactory.getCartao(Tipo.IFCARD).getAutorizacao();
		CartaoFactory.getCartao(Tipo.IFCARD).validaNumero();
	}
}
