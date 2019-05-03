package gof;

public class EmailComConfirmacaoEntrega extends EmailDecorator{

	public EmailComConfirmacaoEntrega(Email email) {
		super(email);
	}

	@Override
	public void enviar() {
		this.getEmail().enviar();
		System.out.println("Com confirma��o de entrega");
	}

}
