package gof;

public class EmailComAnexo extends EmailDecorator{

	public EmailComAnexo(Email email) {
		super(email);
	}

	@Override
	public void enviar() {
		this.getEmail().enviar();
		System.out.println("Com Anexo");
	}
	
}
