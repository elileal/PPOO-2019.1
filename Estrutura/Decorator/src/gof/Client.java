package gof;

public class Client {
	public static void main(String[] args) {
		// normal
		Email e1 = new EmailNormal("assunto", "de", "para", "texto");
		
		// com anexo
		Email e2 = new EmailComAnexo(e1);
		
		// com confirmação de entrega
		Email e3 = new EmailComConfirmacaoEntrega(e1);
		
		// com anexo e confirmação de entrega
		Email e4 = new EmailComAnexo(new EmailComConfirmacaoEntrega(e1));
				
		e1.enviar();
		e2.enviar();
		e3.enviar();
		e4.enviar();
	}
}
