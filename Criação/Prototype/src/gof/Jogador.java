package gof;

import java.util.ArrayList;
import java.util.List;

public class Jogador implements Cloneable{
	private String nome;
	private List<String> poderes;

	public Jogador(String nome) {
		this.nome = nome;
		this.poderes = new ArrayList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getPoderes() {
		return poderes;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", poderes=" + poderes + "]";
	}
	
	public void add(String poder) {
		this.poderes.add(poder);
	}
	
	@Override
	protected Jogador clone() {
		try {
			Jogador jogador = (Jogador) super.clone();
			jogador.poderes = new ArrayList<String>(this.poderes);
			return jogador;
		}catch (CloneNotSupportedException e) {
			return null;
		}
		
	}
}
