package Questao8;

public class Funcionario extends Pessoa{

	protected double salario;
	
	public Funcionario(double salario, String nome, Data data) {
		super(nome, data);
		this.salario = salario;
	}

	public double calculaImposto() {
		return salario*3/100;

	}
	
	@Override
	public String imprimeDados() {
		return 	"Nome "+nome+"\n"+
				"Nascimento: "+nascimento.getDia()+"/"+nascimento.getMes()+"/"+nascimento.getAno()+"\n"+
				"Salário: "+salario+"\n"+
				"Imposto: "+calculaImposto();
	
	}

}
