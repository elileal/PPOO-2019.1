package seguro;

public class Pessoa {
	private String nome, cpf, rg;
	private int idade;
	private float peso, altura;

	// construtor fechado
	private Pessoa() {}

	// builder
	public static final class Builder{
		private String nome, cpf, rg;
		private int idade;
		private float peso, altura;

		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public Builder rg(String rg) {
			this.rg = rg;
			return this;
		}

		public Builder idade(int idade) {
			this.idade = idade;
			return this;
		}

		public Builder peso(float peso) {
			this.peso = peso;
			return this;
		}

		public Builder altura(float altura) {
			this.altura = altura;
			return this;
		}

		public Pessoa create() {
			Pessoa p = new Pessoa();
			p.altura = this.altura;
			p.cpf = this.cpf;
			p.idade = this.idade;
			p.nome = this.nome;
			p.peso = this.peso;
			p.rg = this.rg;
			return p;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", idade=" + idade + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}
