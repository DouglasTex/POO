package Questao2;

public class Pessoa {
	
	private String nome;
	private int idade;
	private int altura;
	private double peso;
	private String sexo;
	
	public Pessoa(String nome, int idade, int altura, double peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome +
				"Idade: " + idade +
				"Altura: " + altura +
				"Peso: " + peso +
				"Sexo: " + sexo;
	}
	
	

}
