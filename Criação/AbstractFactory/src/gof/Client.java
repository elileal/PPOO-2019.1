package gof;

public class Client {
	public static void main(String[] args) {
		ProvedorFactory.getFactory(Provedor.GMAIL).criarSMTP().enviar();
	}
}
