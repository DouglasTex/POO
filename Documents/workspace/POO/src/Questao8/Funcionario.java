package Questao8;

public class Funcionario extends Pessoa{

	public Funcionario(String area, String nome, Data data) {
		super(area, nome, data);
	}
	
	public Funcionario(float salario, String nome, Data data) {
		super(salario, nome, data);
	}

	public float calculaImposto() {
		return 0;

	}
	
	@Override
	public String imprimeDados() {
		// TODO Auto-generated method stub
		return null;
	}

}
