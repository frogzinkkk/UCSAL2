package pessoa;

public abstract class PessoaAbstract implements PessoaInterface{
	
	private String nome;
	private String telefone;
	private String endereco;
	private Float valorMensal;
	private Float valorFatura;


	@Override
	public Float faturar() {
		return 0f;
	}

	@Override
	public void telaEntradaDados() {

	}

	public PessoaAbstract() {
	}

	public PessoaAbstract(String nome, String telefone, String endereco, Float valorMensal, Float valorFatura) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.valorMensal = valorMensal;
		this.valorFatura = valorFatura;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Float getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(Float valorMensal) {
		this.valorMensal = valorMensal;
	}

	public Float getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(Float valorFatura) {
		this.valorFatura = valorFatura;
	}
}
