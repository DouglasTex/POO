package Questao8;

public class Gerente extends Funcionario {
	private String area;
	
	public Gerente(String area, double salario, String nome, Data data) {
		super(salario, nome, data);
		this.area = area;
	}
	
	@Override
	public double calculaImposto() {
		
		return salario*5/100;
	}
	@Override
	public String imprimeDados() {
		return 	"Nome "+nome+"\n"+
				"Area: "+area+"\n"+
				"Nascimento: "+nascimento.getDia()+"/"+nascimento.getMes()+"/"+nascimento.getAno()+"\n"+
				"Salário: "+salario+"\n"+
				"Imposto: "+calculaImposto();
	}

	
}
