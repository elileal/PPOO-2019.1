package tradicional;

public class PessoaBuilder implements Builder<Pessoa> {
	private String nome, cpf, rg;
	private int idade;
	private float peso, altura;

	public PessoaBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}

	public PessoaBuilder cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public PessoaBuilder rg(String rg) {
		this.rg = rg;
		return this;
	}

	public PessoaBuilder idade(int idade) {
		this.idade = idade;
		return this;
	}

	public PessoaBuilder peso(float peso) {
		this.peso = peso;
		return this;
	}

	public PessoaBuilder altura(float altura) {
		this.altura = altura;
		return this;
	}

	@Override
	public Pessoa create() {
		Pessoa p = new Pessoa();
		p.setAltura(this.altura);
		p.setCpf(this.cpf);
		p.setIdade(this.idade);
		p.setNome(this.nome);
		p.setPeso(this.peso);
		p.setRg(this.rg);
		return p;
	}
}
