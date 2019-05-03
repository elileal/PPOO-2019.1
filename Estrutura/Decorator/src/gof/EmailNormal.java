package gof;

public class EmailNormal implements Email {
	private String assunto, de, para, texto;

	public EmailNormal(String assunto, String de, String para, String texto) {
		this.assunto = assunto;
		this.de = de;
		this.para = para;
		this.texto = texto;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "EmailNormal [assunto=" + assunto + ", de=" + de + ", para=" + para + ", texto=" + texto + "]";
	}

	public void enviar() {
		System.out.println("E-mail enviado");
	}
}
