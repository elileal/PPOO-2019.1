package gof;

import java.util.ArrayList;
import java.util.List;

public class Telefone {
	private List<Contato> contatos;
	
	public Telefone() {
		this.contatos = new ArrayList<Contato>();
	}
	
	public void add(Contato contato) {
		this.contatos.add(contato);
	}
	
	public List<Contato> get(){
		return this.contatos;
	}
}
