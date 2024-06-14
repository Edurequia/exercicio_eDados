package entities;

public class Volei implements Comparable<Volei>{
	private String nome;
	private String apelido;
	private Double altura;
	private String posicao;
	
	public Volei(String nome, String apelido, Double altura, String posicao) { 
		this.nome = nome;
		this.apelido = apelido;
		this.altura = altura;
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	@Override
	public int compareTo(Volei o) {
		return this.nome.compareTo(o.nome);
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Apelido: " + apelido + ", Altura: " + altura + ", Posicao: " + posicao;
	}
}
