package Questao8;

public abstract class Pessoa {

	protected String nome;
	protected Data nascimento;
	protected float salario;
	
	public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public abstract String imprimeDados();
	
}
