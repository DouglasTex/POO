package Questao8;

public abstract class Pessoa {

	private String nome;
	private Data nascimento;
	private float salario;
	private int codigo;
	private String area;
	
	public Pessoa(String area, String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public Pessoa(float salario, String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public Pessoa(int codigo, String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.codigo = codigo;
	}
	
	public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public abstract String imprimeDados();
	
}
